package io.gitee.inrgihc.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import io.gitee.inrgihc.ioc.bean.TestBean;

/**
 * 模拟 BeanFactory 底层是如何工作的
 * 
 * <p>
 * 参考地址：https://mp.weixin.qq.com/s/I6SPNQaQgJkGTh-pKpDPTg
 * </p>
 * 
 * @author tang
 *
 */
public class Application {

	public static void main(String[] args) {
		DefaultListableBeanFactory contaner = new DefaultListableBeanFactory();

		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) contaner;
		AbstractBeanDefinition bd = new RootBeanDefinition(TestBean.class);
		registry.registerBeanDefinition("testBean", bd);

		BeanFactory bf = (BeanFactory) contaner;
		TestBean tb = bf.getBean(TestBean.class);
		tb.test();
	}

}
