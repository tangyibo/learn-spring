package io.gitee.inrgihc.aop1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.aop1.config.MyAppConfig;
import io.gitee.inrgihc.aop1.service.EmailService;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		EmailService service=ctx.getBean(EmailService.class);
		service.say("xxxx");
	}

}
