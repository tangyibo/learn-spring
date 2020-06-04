package io.gitee.inrgihc.factorybean.domain;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PersonFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		return new Person();
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
