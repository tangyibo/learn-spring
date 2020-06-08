package io.gitee.inrgihc.myservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyServiceProperties.class)
@ConditionalOnClass(MyExecuteService.class)
public class MyServiceAutoConfiguration {

	@Autowired
	MyServiceProperties properties;
	
	@Bean
	@ConditionalOnMissingBean
	public MyExecuteService myExecuteService() {
		MyExecuteService s=new MyExecuteService();
		s.setNameOfService(properties.getName());
		s.setElipseOfSeconds(properties.getCount());
		return s;
	}
}
