package io.gitee.inrgihc.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import io.gitee.inrgihc.lookup.bean.ClassFactory;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private ClassFactory factory;

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		context.registerShutdownHook();
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i=0;i<10;i++) {
			factory.callBeanMethod();
		}
		
	}

}
