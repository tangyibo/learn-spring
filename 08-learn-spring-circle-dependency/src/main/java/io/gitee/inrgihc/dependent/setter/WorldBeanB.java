package io.gitee.inrgihc.dependent.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorldBeanB {

	private WorldBeanA beanA;

	public WorldBeanA getBeanA() {
		return beanA;
	}

	@Autowired
	public void setBeanA(WorldBeanA beanA) {
		System.out.println("WorldBeanB:setBeanA() called!");
		this.beanA = beanA;
	}
	
}
