package oi.gitee.inrgihc.service.impl;

import org.springframework.stereotype.Component;

import oi.gitee.inrgihc.service.ITestService;

@Component
public class FistTestService implements ITestService {

	@Override
	public void test() {
		System.out.println("FistTestService::test()!");
	}

}
