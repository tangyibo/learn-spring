package io.gitee.inrgihc.beanpostprocesser.bean;

import java.util.Iterator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Iterator<String> it = beanFactory.getBeanNamesIterator();
		while (it.hasNext()) {
			String beanName = it.next();
			if (beanFactory.containsBeanDefinition(beanName)) {
				BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
				System.out.println("======" + bd.getBeanClassName());
			}
		}

	}

}
