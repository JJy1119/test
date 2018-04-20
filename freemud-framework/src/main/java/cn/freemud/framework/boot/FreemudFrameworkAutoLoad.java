package cn.freemud.framework.boot;

import cn.freemud.framework.caching.memory.MemoryCacheOptions;
import cn.freemud.framework.spring.SpringStartRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shaocheng.ding
 */
@Configuration
@EnableConfigurationProperties(MemoryCacheOptions.class)
public class FreemudFrameworkAutoLoad {
    public @Bean
    CommandLineRunner springStartRunner() {
        return new SpringStartRunner();
    }
}
