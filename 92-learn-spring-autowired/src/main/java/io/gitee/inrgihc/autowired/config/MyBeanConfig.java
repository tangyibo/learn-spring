package io.gitee.inrgihc.autowired.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import io.gitee.inrgihc.autowired.annotation.MyAnnot;
import io.gitee.inrgihc.autowired.bean.Person;

@Configuration
public class MyBeanConfig {

	@MyAnnot
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Description("This is a man person")
	public Person getPersonMan() {
		return new Person("join","boy");
	}
	
	@MyAnnot
	@Bean
	public Person getPersonWoman() {
		return new Person("lucy","girl");
	}
	
	@Bean
	@Lazy(true)
	public Person getName() {
		return new Person("unkown","girl");
	}
}
