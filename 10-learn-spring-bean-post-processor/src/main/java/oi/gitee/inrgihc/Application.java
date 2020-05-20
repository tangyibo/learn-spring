package oi.gitee.inrgihc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import oi.gitee.inrgihc.config.AppConfig;
import oi.gitee.inrgihc.domain.HelloWorld;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.setMessage("hello world!");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
