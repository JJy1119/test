package cn.freemud.framework.boot;

import cn.freemud.framework.caching.ICacheManager;
import cn.freemud.framework.caching.memory.MemoryCacheManager;
import cn.freemud.framework.caching.memory.MemoryCacheOptions;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author dingshaocheng
 */
@AutoConfigureOrder
@ConditionalOnMissingBean(ICacheManager.class)
@EnableConfigurationProperties(MemoryCacheOptions.class)
public class MemoryCacheAutoLoad {

    @Bean
    public ICacheManager memoryCacheManager(){
        return new MemoryCacheManager();
    }
}
