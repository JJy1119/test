package cn.freemud.framework.msmq.boot;

import cn.freemud.framework.msmq.ListenerMetadata;
import cn.freemud.framework.msmq.config.MsmqOptions;
import cn.freemud.framework.spring.AppContext;
import cn.freemud.framework.msmq.MsmqScheduler;
import cn.freemud.framework.msmq.annos.MsmqListener;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/**
 * @author shaocheng.ding
 */
@Configuration
@EnableConfigurationProperties({MsmqOptions.class})
public class MsmqAutoLoad implements ImportAware {

    HashSet<ListenerMetadata> listenerMetadatas = new HashSet<>();

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        final Map<String, Object> beansWithAnnotation = AppContext.getCurrentContext().getApplicationContext().getBeansWithAnnotation(Component.class);
        for (Object instance:beansWithAnnotation.values()){
            Arrays.stream(instance.getClass().getMethods()).forEach(m->{
                final MsmqListener annotation = AnnotatedElementUtils.findMergedAnnotation(m,MsmqListener.class);
                if(annotation!=null){
                    final ListenerMetadata listenerMetadata = new ListenerMetadata();
                    listenerMetadata.setMethod(m);
                    listenerMetadata.setMsmqListener(annotation);
                    listenerMetadata.setInstance(instance);
                    listenerMetadatas.add(listenerMetadata);
                }
            });
        }

        //2、聚合注解上的所有queueName（distinct）
        //methodHashSet.stream().forEach(listenerHandler -> listenerHandler.schedule());
        //3、开启线程池监听所有queueName的队列数据
    }

    @Bean
    public MsmqScheduler getMqScheduler(){
        return new MsmqScheduler(listenerMetadatas);
    }
}
