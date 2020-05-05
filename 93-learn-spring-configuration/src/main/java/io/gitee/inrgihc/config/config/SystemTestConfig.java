package io.gitee.inrgihc.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DefaultRepositoryConfig.class,ServiceConfig.class})
public class SystemTestConfig {

	@Bean
	public String str() {
		return "hello";
	}
}
