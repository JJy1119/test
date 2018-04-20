package cn.freemud.framework.msmq.annos;


import cn.freemud.framework.msmq.boot.MsmqAutoLoad;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 是否启用msmq
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MsmqAutoLoad.class)
public @interface EnableMsmq {
}
