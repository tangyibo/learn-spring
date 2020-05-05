package io.gitee.inrgihc.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Person {

	@Autowired
    private ApplicationContext context;
	
	private String name;
	private String sex;
	private int age;
	
	public Person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	@Override
	public String toString() {
		System.out.println(context);
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
