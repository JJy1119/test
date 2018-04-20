package cn.freemud.framework.redis;

import cn.freemud.framework.utils.EncryptUtil;
import cn.freemud.framework.utils.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @version V1.0
 * @Title: Redis
 * @Package: com.freemud.base.message
 * @Descripttion: redis对template封装
 * @author:xudong.cai
 * @date: 2017/5/10
 * @Copyright: 2017 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目.
 */
@Component
public class RedisClient {
    private static final Logger logger = LoggerFactory.getLogger(RedisClient.class);
    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通过k获取value，redis数据结构为 k-v
     *
     * @param key
     * @return
     */
    public <T> Optional<T> getValue(String key, Class<T> tClass) {
        try {
            BoundValueOperations<String, String> operations = template.boundValueOps(key);
            String str = operations.get();
            if (str == null) {
                return Optional.empty();
            }
            return Optional.ofNullable(JSON.parseObject(str, tClass));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return Optional.empty();
    }

    public <T> List<T> getListValue(String key, Class<T> tClass) {
        try {
            BoundValueOperations<String, String> operations = template.boundValueOps(key);
            String str = operations.get();
            if (str == null){
                return new ArrayList<>();
            }
            return JSON.parseArray(str, tClass);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return new ArrayList<>();
    }

    /**
     * 设置k-v
     * 过期时间为1小时
     *
     * @param key
     * @param value
     */
    public void setStringVale(String key, Object value,long expiretime,TimeUnit timeUnit) {
        try {
            template.boundValueOps(key).set(JSON.toJSONString(value), expiretime, timeUnit);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    /**
     * 在hash表增加记录
     *
     * @param key   表名
     * @param hkey  行记录名
     * @param value 值
     */
    public void setHashValue(String key, String hkey, Object value) {
        try {
            template.boundHashOps(key).put(hkey, JSON.toJSONString(value));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    /**
     * 获取hash表数据、
     *
     * @param key
     * @param hkey
     * @return
     */
    public <T> Optional<T> getHashValue(String key, String hkey, Class<T> tClass) {
        try {
            Object obj = template.boundHashOps(key).get(hkey);
            if (obj == null) {
                return Optional.empty();
            }
            String str = obj.toString();
            return Optional.ofNullable(JSON.parseObject(str, tClass));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return Optional.empty();
    }

    /**
     * 删除一个key
     *
     * @param key
     * @param hkey
     */
    public void deleteHashValue(String key, String hkey) {
        try {
            template.boundHashOps(key).delete(hkey);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public <T> void saveList(String key, List<T> vals,long expiretime,TimeUnit timeUnit) {
        try {
            template.boundValueOps(key).set(JSON.toJSONString(vals), expiretime, timeUnit);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public<T> void leftPush(String key, T vals) {
        try {
            template.boundListOps(key).leftPush(JSONObject.toJSONString(vals));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public<T> Optional<T> rightPop(String key) {
        try {
           String str =  template.boundListOps(key).rightPop();
           if(StringUtil.isNullOrWhiteSpace(str)){
               return Optional.empty();
           }
           T ret = JSON.parseObject(str,new TypeReference<T>(){});
           return Optional.ofNullable(ret);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return Optional.empty();
    }

    public<T> void pushAll(String key, List<T> vals) {
        try {
            List<String> ls = new ArrayList<>();
            for (T strVal : vals) {
                ls.add(JSONObject.toJSONString(strVal));
            }
            template.boundListOps(key).leftPushAll(ls.toArray(new String[ls.size()]));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public <T> List<T> range(String key, long start, long end, Class tClass) {
        try {
            List<String> list = template.boundListOps(key).range(start, end);
            String str = list.toString();
            return JSONObject.parseArray(str, tClass);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    public Long incrby(String key, long rank) {
        return template.boundValueOps(key).increment(rank);
    }

//    public Object evalScript(String script,List<String> keys,String... args){
//        final Object result = redisTemplate.execute(new RedisScript() {
//            @Override
//            public String getSha1() {
//                return EncryptUtil.encrypt(script);
//            }
//
//            @Override
//            public Class getResultType() {
//                return Object.class;
//            }
//
//            @Override
//            public String getScriptAsString() {
//                return script;
//            }
//        },keys,args);
//        return result;
//    }

}
