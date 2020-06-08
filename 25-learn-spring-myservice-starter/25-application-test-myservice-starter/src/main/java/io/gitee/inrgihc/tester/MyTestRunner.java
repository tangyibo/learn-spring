package io.gitee.inrgihc.tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.gitee.inrgihc.myservice.MyExecuteService;

@Component
public class MyTestRunner implements CommandLineRunner {

	@Autowired
	private MyExecuteService service;

	@Override
	public void run(String... args) throws Exception {
		service.executeRun();
	}

}
