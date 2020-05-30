package io.gitee.inrgihc.factories.service.impl;

import io.gitee.inrgihc.factories.service.SendService;

public class HelloTestService implements SendService {

	@Override
	public void test() {
		System.out.println(this.getClass().getName()+" instance");
	}

}
