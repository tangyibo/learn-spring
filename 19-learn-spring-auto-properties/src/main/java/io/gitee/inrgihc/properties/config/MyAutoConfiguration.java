package io.gitee.inrgihc.properties.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration implements InitializingBean {

	private PersonProperties personProperties;

	@Autowired
	public MyAutoConfiguration(PersonProperties properties) {
		this.personProperties = properties;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (null == personProperties.getName() || null == personProperties.getAge()) {
			throw new IllegalStateException("Invalid properties configuration");
		}

	}

}
