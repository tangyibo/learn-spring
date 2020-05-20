package oi.gitee.inrgihc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import org.springframework.stereotype.Component;

@Component
public class MyFirstBeanPostProcessor implements BeanPostProcessor,Ordered  {

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("1-BeforeInitialization : " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("1-AfterInitialization : " + beanName);
		return bean;
	}

}
