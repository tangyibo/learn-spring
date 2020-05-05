package io.gitee.inrgihc.simport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.simport.bean.TestBean;
import io.gitee.inrgihc.simport.config.MyFirstConfig;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyFirstConfig.class);

		TestBean bean = (TestBean) ctx.getBean("test");
		System.out.println(bean.toString());
	}

}
