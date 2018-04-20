package cn.freemud.framework.msmq;

import cn.freemud.framework.PlatformException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @author shaocheng.ding
 */
public class MsmqScheduler {
    private Logger logger = LoggerFactory.getLogger(MsmqScheduler.class);
    private HashSet<ListenerMetadata> listenerMetadatas;

    public MsmqScheduler(HashSet<ListenerMetadata> listenerMetadatas){
        this.listenerMetadatas = listenerMetadatas;
    }

    public void scheduleAllListeners(){
        if(listenerMetadatas !=null && !listenerMetadatas.isEmpty()){
            for(ListenerMetadata listenerMetadata: listenerMetadatas){
                schedule(listenerMetadata);
            }
        }
    }

    public void schedule(ListenerMetadata listenerMetadata){
        MsmqClient client = new MsmqClient();
        //new ThreadPoolExecutor(1,)
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r,"threadpool-"+listenerMetadata.getMsmqListener().queueName());
                return thread;
            }
        },new ThreadPoolExecutor.AbortPolicy());
        final Class argType = listenerMetadata.getMethod().getParameterTypes()[0];
        final String queueName = listenerMetadata.getMsmqListener().queueName();
        final Method method = listenerMetadata.getMethod();
        final Object instance = listenerMetadata.getInstance();
        pool.execute(() -> {
            client.open(queueName);
            logger.info("开始调度");
            try {
                while (true) {
                    try {
                        Object msg = client.receive(argType,2000);
                        method.invoke(instance,msg);
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (MsmqTimeOutException e){
                        logger.info("没有消息");
                    } catch (PlatformException e){
                        e.printStackTrace();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
            }  finally {
                logger.info("结束调度");
                client.close();
            }
        });
    }
}
