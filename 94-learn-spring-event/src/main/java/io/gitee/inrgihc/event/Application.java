package io.gitee.inrgihc.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.event.service.EmailService;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("io.gitee.inrgihc.event");
		ctx.refresh();
		ctx.start();
		
		EmailService service=ctx.getBean(EmailService.class);
		
		List<String> blackList=new ArrayList<String>();
		blackList.add("1111");
		blackList.add("2222");
		
		service.setBlackList(blackList);
		service.sendEmail("1111");
		service.sendEmail("dddddd");
	}

}
