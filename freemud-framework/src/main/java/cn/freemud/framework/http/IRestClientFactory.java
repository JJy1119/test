package cn.freemud.framework.http;

/**
 * @author shaocheng.ding
 */
public interface IRestClientFactory {
    /**
     * 创建一个restclient
     *
     * @param traced 是否记录日志
     */
    void createClient(boolean traced);
}
