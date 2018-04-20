package cn.freemud.pay.consumer.anno;

import cn.freemud.framework.msmq.annos.MsmqListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@MsmqListener(queueName = "test")
public @interface TestQueueConsumer {
}
