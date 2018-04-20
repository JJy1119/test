package cn.freemud.pay.api.controller;

import cn.freemud.framework.amqp.IMsgSender;
import cn.freemud.framework.caching.autocache.CacheResult;
import cn.freemud.framework.msmq.annos.MsmqListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cn.freemud.framework.redis.RedisClient;

import java.util.Optional;

/**
 * @author shaocheng.ding
 */
@RestController
public class ZhuihuController {

    @Autowired
    private IMsgSender msgSender;

    @Autowired
    private RedisClient redisClient;

    @MsmqListener(queueName = "test")
    public void Test(String ob){
        final Optional<String> dd = redisClient.getValue("dd", String.class);
        System.out.println(ob);
    }

    @RequestMapping(value = "hellow", method = {RequestMethod.GET})
    @CacheResult(keyParamNames = {"ob","a","c"},cacheTime = 10000)
    public Object Hello(String ob,String a,String c){
        msgSender.send("test",ob+1);
        msgSender.send("test",ob+2);
        msgSender.send("test",ob+3);
        msgSender.send("test",ob+4);
        msgSender.send("test",ob+5);
        msgSender.send("test",ob+6);
        return "hello";
    }
}
