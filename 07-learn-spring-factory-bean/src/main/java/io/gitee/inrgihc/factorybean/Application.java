package io.gitee.inrgihc.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import io.gitee.inrgihc.factorybean.domain.Person;
import io.gitee.inrgihc.factorybean.domain.PersonFactoryBean;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("io.gitee.inrgihc.factorybean");
		ctx.refresh();

		Person bean=(Person) ctx.getBean("personFactoryBean");
		System.out.println(bean.toString());

		PersonFactoryBean factoryBean=(PersonFactoryBean)ctx.getBean("&personFactoryBean");
		System.out.println(factoryBean.toString());
	}

}
