package cn.freemud.pay.consumer;

import cn.freemud.framework.anno.EnableFreemudFramework;
import cn.freemud.framework.msmq.annos.EnableMsmq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shaocheng.ding
 */
@EnableFreemudFramework
@EnableMsmq
@SpringBootApplication
@ComponentScan("cn.freemud.*")
public class ConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
