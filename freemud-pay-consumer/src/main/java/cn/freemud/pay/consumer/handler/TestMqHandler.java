package cn.freemud.pay.consumer.handler;

import cn.freemud.pay.consumer.anno.TestQueueConsumer;
import org.springframework.stereotype.Component;

/**
 * @author shaocheng.ding
 */
@Component
public class TestMqHandler {

    @TestQueueConsumer
    public void Consume(String msg){
        System.out.println(msg);
    }
}
