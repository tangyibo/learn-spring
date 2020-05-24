package io.gitee.inrgihc.test.impl;

import io.gitee.inrgihc.test.api.ICalculator;

public class SecondCalculator implements ICalculator{

	@Override
	public int add(int x, int y) {
		String ret= String.valueOf(x)+String.valueOf(y);
		return Integer.valueOf(ret);
	}

}
