package io.gitee.inrgihc.selector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.gitee.inrgihc.selector.bean.TestBean;

@Configuration
public class MyProjectConfig {

	@Bean
	public TestBean testBean() {
		return new TestBean("aa","bb");
	}
}
