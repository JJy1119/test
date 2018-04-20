package cn.freemud.framework.caching;

/**
 * Created by sharp on 2017/3/5.
 */
@FunctionalInterface
public interface IPostEvictionCallback {
    void callback(Object key, Object value, EvictionReason reason, Object state);
}
