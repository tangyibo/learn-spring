package io.gitee.inrgihc.properties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix=PersonProperties.PERSON_PREFIX)
public class PersonProperties {
	
	public static final String PERSON_PREFIX = "spring.tang.person";
	
	private String name="hello";
	
	private Integer age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonProperties [name=" + name + ", age=" + age + "]";
	}
	
}
