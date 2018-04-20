package cn.freemud.caching.redis;

import cn.freemud.framework.PlatformException;
import cn.freemud.framework.caching.ICacheManager;
import cn.freemud.framework.redis.RedisClient;
import cn.freemud.framework.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shaocheng.ding
 */
public class RedisCacheManager implements ICacheManager {

    @Autowired
    private RedisClient redisClient;

    @Override
    public Object get(String key, String region) {
        if(StringUtil.isNullOrWhiteSpace(region)){
            throw new PlatformException("不支持region");
        }
        return null;
    }

    @Override
    public void set(String key, Object data, Long timeoutMilliseconds, String region, boolean useSlidingExpiration) {

    }

    @Override
    public void remove(String key, String region) {

    }

    @Override
    public boolean refresh(String key, String region) {
        return false;
    }

    @Override
    public void clearRegion(String region) {

    }

    @Override
    public void clear() {

    }
}
