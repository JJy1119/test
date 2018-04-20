package cn.freemud.framework.msmq;

import cn.freemud.framework.PlatformException;
import cn.freemud.framework.caching.ICacheManager;
import com.alibaba.fastjson.JSON;
import ionic.Msmq.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

/**
 * @author shaocheng.ding
 */
public class MsmqClient {
    private Queue queue;
    private final int TIMEOUTCODE = -1072824293;
    private final Logger logger = LoggerFactory.getLogger(MsmqClient.class);

    private void checkOpen()
            throws MessageQueueException {
        if (queue==null) {
            throw new MessageQueueException("open a queue first!\n", -1);
        }
    }

    public MsmqClient(){
        //ionic.Msmq.Queue
    }

    /**
     * Opening a queue for operation
     */
    public void open(String queueName) {
        try {
            String path = getQueueFullName("sh-sc-ding-pc",queueName);
            queue = new Queue(path);
        } catch (MessageQueueException e) {
            e.printStackTrace();
        }
    }
    private String getQueueFullName( String hostname, String queueShortName ) {
        String h1= hostname;
        String a1= "OS";
        char min = '1';
        char max = '9';
        if ((h1==null) || h1.equals("")) {
            h1=".";
        }
        char[] c= h1.toCharArray();
        if ((c[0]>=min)
                && (c[0]<=max)) {
            a1= "TCP";
        }

        return "DIRECT=" + a1 + ":" + h1 + "\\private$\\" + queueShortName;
    }
    public <T> T receive(Class<T> tClass,int timeout) throws Exception{
        try {
           checkOpen();
           final Message msg =  queue.receive(timeout);
           final String json = new String(msg.getBody(),"utf-8");
           if(String.class.equals(tClass)){
               return (T)json;
           }
           final T result = JSON.parseObject(json,tClass);
           return result;
        } catch (MessageQueueException e) {
            if(TIMEOUTCODE!=e.hresult){
                throw new PlatformException(e);
            }else{
                throw new MsmqTimeOutException(e);
            }
        }
    }

    public void send(Object msg,String label){
        try {
            checkOpen();
            Message msgWapper = new Message(JSON.toJSONString(msg));
            msgWapper.setLabel(label);
            queue.send(msgWapper);
        } catch (MessageQueueException e) {
            logger.error("send error ",e);
        } catch (UnsupportedEncodingException e) {
            logger.error("Serialize error ",e);
        }
    }

    public void close(){
        if(queue!=null){
            try {
                queue.close();
            } catch (MessageQueueException e) {
                e.printStackTrace();
            }
        }
        queue = null;
    }
}
