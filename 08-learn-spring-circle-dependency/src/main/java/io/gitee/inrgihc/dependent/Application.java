package io.gitee.inrgihc.dependent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.dependent.constructor.HelloBeanA;
import io.gitee.inrgihc.dependent.field.TestBeanA;
import io.gitee.inrgihc.dependent.setter.WorldBeanA;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.setAllowBeanDefinitionOverriding(false);
		//ctx.scan("io.gitee.inrgihc.dependent.field");
		//ctx.scan("io.gitee.inrgihc.dependent.constructor");
		ctx.scan("io.gitee.inrgihc.dependent.setter");
		ctx.refresh();

		//成员变量注入
		//TestBeanA tbean=(TestBeanA) ctx.getBean("testBeanA");
		//System.out.println(tbean.toString());
		
		//构造函数注入
		//HelloBeanA hbean=(HelloBeanA) ctx.getBean("helloBeanA");
		//System.out.println(hbean.toString());

		//setter方法注入
		WorldBeanA wbean=(WorldBeanA) ctx.getBean("worldBeanA");
		System.out.println(wbean.toString());
	}

}
