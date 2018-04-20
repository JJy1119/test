package cn.freemud.pay.api;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author sd02
 */
@Configuration
public class WebConfigAdapter extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);

		//  初始化转换器
		final FastJsonHttpMessageConverter4 fastConvert = new FastJsonHttpMessageConverter4();
		//  初始化一个转换器配置
		final FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setDateFormat("yyyy-MM-dd hh:mm:ss");
		fastJsonConfig.setCharset(Charset.forName("UTF-8"));
		//  将配置设置给转换器并添加到HttpMessageConverter转换器列表中
		fastConvert.setFastJsonConfig(fastJsonConfig);

		converters.add(fastConvert);
	}
}