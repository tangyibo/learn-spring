package io.gitee.inrgihc.test.impl;

import io.gitee.inrgihc.test.api.ICalculator;

public class FirstCalculator implements ICalculator{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

}
