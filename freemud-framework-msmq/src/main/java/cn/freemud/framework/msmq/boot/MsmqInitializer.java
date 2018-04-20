package cn.freemud.framework.msmq.boot;

import cn.freemud.framework.IApplicationInitializer;
import cn.freemud.framework.msmq.MsmqScheduler;
import cn.freemud.framework.spring.AppContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author shaocheng.ding
 */
@Component
public class MsmqInitializer implements IApplicationInitializer {
    @Override
    public void run() {
        final Map<String, MsmqScheduler> beansOfType = AppContext.getCurrentContext().getApplicationContext().getBeansOfType(MsmqScheduler.class);
        if(beansOfType!=null && !beansOfType.isEmpty()){
            beansOfType.forEach((k,b)->{
                b.scheduleAllListeners();
            });
        }
    }
}
