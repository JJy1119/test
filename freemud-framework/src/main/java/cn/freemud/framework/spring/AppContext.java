package cn.freemud.framework.spring;

import org.springframework.context.ApplicationContext;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shaocheng.ding
 */
public final class AppContext {
    private AppContext(){}


    private static class AppContextHolder{
        private static AppContext context = new AppContext();
    }


    public static AppContext getCurrentContext(){
        return AppContextHolder.context;
    }

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext context){
        this.applicationContext = context;
    }

    public ApplicationContext getApplicationContext(){
        return this.applicationContext;
    }
}
