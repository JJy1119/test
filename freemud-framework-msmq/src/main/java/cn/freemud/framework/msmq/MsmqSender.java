package cn.freemud.framework.msmq;

import cn.freemud.framework.Guard;
import cn.freemud.framework.amqp.IMsgSender;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

/**
 * @author shaocheng.ding
 */
@Component
public class MsmqSender implements IMsgSender {

    private void verifyMsg(Object msg) {
        Guard.ArgumentNotNull(msg, "msg");
        String json = JSON.toJSONString(msg);
    }

    @Override
    public void send(String exchange, String queueName, Object msg) {
        MsmqClient client = new MsmqClient();
        try {
            client.open(queueName);
            client.send(msg, "");
        } finally {
            client.close();
        }
    }

    @Override
    public void send(String queueName, Object msg) {
        send("",queueName,msg);
    }
}
