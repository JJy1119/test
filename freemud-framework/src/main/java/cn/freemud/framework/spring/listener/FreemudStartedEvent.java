package cn.freemud.framework.spring.listener;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author vh02
 * @date 2017/7/7
 */
public class FreemudStartedEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public FreemudStartedEvent(Object source) {
        super(source);
    }
}
