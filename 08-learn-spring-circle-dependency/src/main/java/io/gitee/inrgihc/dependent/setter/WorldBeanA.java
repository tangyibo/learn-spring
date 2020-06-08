package io.gitee.inrgihc.dependent.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorldBeanA {

	private WorldBeanB beanB;

	public WorldBeanB getBeanB() {
		return beanB;
	}

	@Autowired
	public void setBeanB(WorldBeanB beanB) {
		System.out.println("WorldBeanA:setBeanB() called!");
		this.beanB = beanB;
	}
	
	
}
