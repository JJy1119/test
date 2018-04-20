package cn.freemud.framework.caching.autocache;

import cn.freemud.framework.caching.ICacheManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author shaocheng.ding
 */
@Aspect
@Component
public class CacheDynamicInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(CacheDynamicInterceptor.class);
    @Autowired
    private ICacheManager cacheManager;

    @Around("@annotation(cn.freemud.framework.caching.autocache.CacheResult)")
    public Object doCache(final ProceedingJoinPoint pjp) throws Throwable {
        final MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        final Object target = pjp.getTarget();
        final Method currentMethod = target.getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        final CacheResult cacheResult = AnnotatedElementUtils.findMergedAnnotation(currentMethod, CacheResult.class);
        final String[] keyNames = cacheResult.keyParamNames();
        if(keyNames==null || 0 == keyNames.length){
            //TODO:这里纠结一把，暂且就不走缓存把
            return pjp.proceed();
        }
        final StringBuilder sbKey = new StringBuilder();
        final String[] parameters = methodSignature.getParameterNames();
        //final Stream<String> keyNameStream = Arrays.stream(keyNames);
        for (int i=0;i< parameters.length;i++){
            int finalI = i;
            if(Arrays.stream(keyNames).anyMatch(s->s.equals(parameters[finalI]))){
                sbKey.append(parameters[finalI])
                        .append(":")
                        .append(pjp.getArgs()[finalI]);
            }
        }
        String key = sbKey.toString();
        Object result = cacheManager.getOrSet(key,s -> {
            try {
                return pjp.proceed();
            } catch (Throwable throwable) {
                logger.error("获取数据失败",throwable);
            }
            return null;
        },cacheResult.cacheTime(),true);
        return result;
    }
}
