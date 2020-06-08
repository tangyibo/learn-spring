package io.gitee.inrgihc.dependent.constructor;

import org.springframework.stereotype.Component;

@Component
public class HelloBeanA {
	
	private HelloBeanB beanB;
	
	public HelloBeanA(HelloBeanB beanB) {
		this.beanB=beanB;
	}
}
