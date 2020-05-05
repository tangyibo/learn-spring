package io.gitee.inrgihc.lookup.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class ClassFactory {
	
	@Lookup
	public abstract ClassBeanA createClassBeanA();

	public void callBeanMethod() {
		ClassBeanA classA = createClassBeanA();
        System.out.println("The hashcode is " + classA.toString());
	}
}
