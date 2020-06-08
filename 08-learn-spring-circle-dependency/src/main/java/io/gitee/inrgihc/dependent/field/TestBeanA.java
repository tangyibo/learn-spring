package io.gitee.inrgihc.dependent.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class TestBeanA {

	@Autowired
	private TestBeanB beanB;
}
