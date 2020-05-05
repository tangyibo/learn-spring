package io.gitee.inrgihc.aop1.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	
	public EmailService() {
		System.out.println("EmailService() function !!!!!!!!");
	}

	public String say(String s) {
		System.out.println("say() function !!!!!!!!");
		return "hello:"+s;
	}
}
