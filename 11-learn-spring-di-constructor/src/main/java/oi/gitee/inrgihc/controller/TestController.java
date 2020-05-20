package oi.gitee.inrgihc.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import oi.gitee.inrgihc.service.ITestService;

@Component
public class TestController {

	private ITestService ts1;
	private ITestService ts2;

	public TestController(@Qualifier("fistTestService") ITestService s1,
			@Qualifier("fistTestService") ITestService s2) {
		this.ts1 = s1;
		this.ts2 = s2;
	}

	public void run() {
		this.ts1.test();
		this.ts2.test();
	}
}
