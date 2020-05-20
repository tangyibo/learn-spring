package oi.gitee.inrgihc.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
	
}
