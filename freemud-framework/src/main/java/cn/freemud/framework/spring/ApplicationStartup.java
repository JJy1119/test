package cn.freemud.framework.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;


/**
 * @author sd02
 */
public class ApplicationStartup implements SpringApplicationRunListener, Ordered {

    public ApplicationStartup(){}

    public ApplicationStartup(SpringApplication application, String[] args) {
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void starting() {

    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        AppContext.getCurrentContext().setApplicationContext(context);

    }

    @Override
    public void finished(ConfigurableApplicationContext context, Throwable exception) {

    }
}