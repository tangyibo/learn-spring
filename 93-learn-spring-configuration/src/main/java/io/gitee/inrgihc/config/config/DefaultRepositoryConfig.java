package io.gitee.inrgihc.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.gitee.inrgihc.config.dao.AccountRepository;
import io.gitee.inrgihc.config.dao.impl.JdbcAccountRepositoryImpl;

@Configuration
public class DefaultRepositoryConfig implements RepositoryConfig {

	@Bean
	@Override
	public AccountRepository accountRepository() {
		return new JdbcAccountRepositoryImpl();
	}

}
