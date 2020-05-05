package io.gitee.inrgihc.simport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MySecondConfig.class)
public class MyFirstConfig {

	@Bean
	public String str() {
		return "hello";
	}
}
