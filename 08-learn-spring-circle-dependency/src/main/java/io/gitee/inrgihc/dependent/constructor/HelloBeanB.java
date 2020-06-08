package io.gitee.inrgihc.dependent.constructor;

import org.springframework.stereotype.Component;

@Component
public class HelloBeanB {

	private HelloBeanA beanA;
	
	public HelloBeanB(HelloBeanA beanA) {
		this.beanA=beanA;
	}
}
