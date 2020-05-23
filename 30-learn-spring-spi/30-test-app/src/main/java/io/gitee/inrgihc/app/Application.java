package io.gitee.inrgihc.app;

import java.util.Iterator;
import java.util.ServiceLoader;
import io.gitee.inrgihc.test.api.ICalculator;

class CalculatorFactory {

	private CalculatorFactory() {
	}

	public static ICalculator getCalculator() {
		ServiceLoader<ICalculator> shouts = ServiceLoader.load(ICalculator.class);

		Iterator<ICalculator> it = shouts.iterator();
		if (it.hasNext()) {
			ICalculator s = it.next();
			return s;
		}
		
		return null;
	}
}

public class Application {

	public static void main(String[] args) {
		ICalculator c=CalculatorFactory.getCalculator();
		System.out.println(c.add(1, 2));
	}

}
