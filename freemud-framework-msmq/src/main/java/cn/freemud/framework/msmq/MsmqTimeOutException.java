package cn.freemud.framework.msmq;

import cn.freemud.framework.PlatformException;

/**
 * @author shaocheng.ding
 */
public class MsmqTimeOutException extends PlatformException {
    public MsmqTimeOutException(String msg) {
        super(msg);
    }

    public MsmqTimeOutException(Throwable e) {
        super(e);
    }
}
