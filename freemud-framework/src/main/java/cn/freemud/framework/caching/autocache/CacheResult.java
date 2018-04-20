package cn.freemud.framework.caching.autocache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheResult {
    /**
     * 缓存键（对应参数名称）要求所有作为key的param都有toString方法
     */
    String[] keyParamNames();

    long cacheTime();
}
