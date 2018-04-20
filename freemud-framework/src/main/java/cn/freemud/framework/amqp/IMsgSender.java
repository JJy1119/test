package cn.freemud.framework.amqp;

/**
 * @author shaocheng.ding
 */
public interface IMsgSender {
    /**
     * 发送消息
     *
     * @param exchange
     * @param queueName
     * @param msg
     */
    void send(String exchange,String queueName,Object msg);

    /**
     * 发送消息
     *
     * @param queueName
     * @param msg
     */
    void send(String queueName,Object msg);
}
