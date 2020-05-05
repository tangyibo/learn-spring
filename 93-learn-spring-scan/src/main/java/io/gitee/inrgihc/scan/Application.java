package io.gitee.inrgihc.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.scan.bean.TestBean;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("io.gitee.inrgihc.scan.bean");
		ctx.refresh();

		TestBean bean=(TestBean) ctx.getBean("test");
		System.out.println(bean.toString());
	}

}
