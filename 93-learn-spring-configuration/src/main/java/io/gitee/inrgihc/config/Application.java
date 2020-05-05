package io.gitee.inrgihc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.config.config.SystemTestConfig;
import io.gitee.inrgihc.config.service.TransferService;


public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SystemTestConfig.class);
		TransferService bean=(TransferService) ctx.getBean("transferService");
		System.out.println(bean.toString());

	}

}
