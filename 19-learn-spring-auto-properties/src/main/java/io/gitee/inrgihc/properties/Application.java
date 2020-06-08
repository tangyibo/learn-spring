package io.gitee.inrgihc.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.gitee.inrgihc.properties.config.PersonProperties;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		PersonProperties properties = ctx.getBean(PersonProperties.class);
		System.out.println(properties);
	}

}
