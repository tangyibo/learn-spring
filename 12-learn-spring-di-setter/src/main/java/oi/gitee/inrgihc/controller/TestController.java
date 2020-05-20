package oi.gitee.inrgihc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import oi.gitee.inrgihc.service.ITestService;

@Component
public class TestController {

	private ITestService ts1;
	private ITestService ts2;

	@Autowired
	@Qualifier("fistTestService")
	public void setTs1(ITestService ts1) {
		this.ts1 = ts1;
	}

	@Autowired
	@Qualifier("fistTestService")
	public void setTs2(ITestService ts2) {
		this.ts2 = ts2;
	}
	
	public ITestService getTs1() {
		return ts1;
	}
	
	public ITestService getTs2() {
		return ts2;
	}

	public void run() {
		this.ts1.test();
		this.ts2.test();
	}
}
