package io.gitee.inrgihc.beanpostprocesser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.gitee.inrgihc.beanpostprocesser.bean.TestBean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		TestBean bean = ctx.getBean("testbean", TestBean.class);
		System.out.println(bean);
		bean.showBean();
	}

}
