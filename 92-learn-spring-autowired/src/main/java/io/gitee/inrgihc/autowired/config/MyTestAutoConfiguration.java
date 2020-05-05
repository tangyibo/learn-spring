package io.gitee.inrgihc.autowired.config;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.gitee.inrgihc.autowired.annotation.MyAnnot;
import io.gitee.inrgihc.autowired.bean.Person;

@Configuration
public class MyTestAutoConfiguration {

	@MyAnnot
	@Autowired(required = false)
	private List<Person> persons = Collections.emptyList();

	@Bean
	public SmartInitializingSingleton loadMyTestInitializer() {
		return new SmartInitializingSingleton() {
			@Override
			public void afterSingletonsInstantiated() {
				for (Person p : persons) {
					p.setAge(12);
					System.out.println(p.toString());
				}
			}
		};
	}
}
