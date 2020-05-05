package io.gitee.inrgihc.simport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.gitee.inrgihc.simport.bean.TestBean;

@Configuration
public class MySecondConfig {

	@Bean
	public TestBean test() {
		return new TestBean();
	}
}
