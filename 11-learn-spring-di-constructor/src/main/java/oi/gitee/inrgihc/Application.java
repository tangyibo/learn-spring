package oi.gitee.inrgihc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import oi.gitee.inrgihc.config.AppConfig;
import oi.gitee.inrgihc.controller.TestController;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestController obj = context.getBean(TestController.class);
		obj.run();
		context.registerShutdownHook();
	}

}
