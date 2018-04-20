package cn.freemud.framework.msmq;

import cn.freemud.framework.Guard;
import cn.freemud.framework.PlatformException;
import cn.freemud.framework.msmq.annos.MsmqListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.*;

/**
 * @author dingshaocheng
 */
public class ListenerMetadata {
    private MsmqListener msmqListener;
    private Method method;
    private Object instance;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        validateMethod(method);
        this.method = method;
    }

    public MsmqListener getMsmqListener() {
        return msmqListener;
    }

    public void setMsmqListener(MsmqListener msmqListener) {
        this.msmqListener = msmqListener;
    }


    public Object getInstance() {
        return instance;
    }

    public void setInstance(Object instance) {
        this.instance = instance;
    }

    private void validateMethod(Method method){
        Guard.ArgumentNotNull(method,"method");
        if(method.getParameterCount()!=1){
            throw new PlatformException("msmq初始化失败:消费者方法签名不符合一个形参的要求:"+method.getName());
        }
    }
}
