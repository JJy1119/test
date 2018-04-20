package cn.freemud.framework.caching;

/**
 * Created by sharp on 2017/3/5.
 */
public class PostEvictionCallbackRegistration {
    private IPostEvictionCallback getEvictionCallback;
    private Object state;

    public PostEvictionCallbackRegistration(IPostEvictionCallback getEvictionCallback, Object state) {
        this.getEvictionCallback = getEvictionCallback;
        this.state = state;
    }

    public IPostEvictionCallback getGetEvictionCallback() {
        return getEvictionCallback;
    }

    public void setGetEvictionCallback(IPostEvictionCallback getEvictionCallback) {
        this.getEvictionCallback = getEvictionCallback;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }
}
