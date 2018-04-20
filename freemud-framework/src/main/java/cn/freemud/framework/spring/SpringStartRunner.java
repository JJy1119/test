package cn.freemud.framework.spring;

import cn.freemud.framework.IApplicationInitializer;
import cn.freemud.framework.spring.listener.FreemudStartedEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.annotation.Order;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author vh02
 * @date 2017/2/13
 */
@Order(value = 1)
public class SpringStartRunner implements CommandLineRunner, ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void run(String... args) throws Exception {
        final List<IApplicationInitializer> initializers = AppContext.getCurrentContext()
                .getApplicationContext()
                .getBeansOfType(IApplicationInitializer.class)
                .values().stream().collect(Collectors.toList());
        if(initializers != null) {
            for(IApplicationInitializer initializer : initializers) {
                initializer.run();
            }
        }

        this.publisher.publishEvent(new FreemudStartedEvent("started") {
        });
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
