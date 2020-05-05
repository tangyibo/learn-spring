package io.gitee.inrgihc.spribatis.util;

import java.util.Set;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * 基于Spring的包扫描接口ClassPathBeanDefinitionScanner实现扫包功能
 * 
 * @author tang
 *
 */
public class MyClassPathMapperScanner extends ClassPathBeanDefinitionScanner {

	public MyClassPathMapperScanner(BeanDefinitionRegistry registry) {
		super(registry, false);
	}

	/**
	 * 默认情况下只有顶层具体类才会通过 只返回是接口的beanDefinition
	 * 
	 * @param beanDefinition bean定义
	 * @return true / false
	 */
	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface() && beanDefinition.getMetadata().isIndependent();
	}

	@Override
	public int scan(String... basePackages) {
		return super.scan(basePackages);
	}

	/**
	 * 覆盖掉父类的doScan方法
	 */
	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		// 父类已经将这些bean注册了
		Set<BeanDefinitionHolder> holders = super.doScan(basePackages);
		processBeanDefinitions(holders);
		return holders;
	}

	private void processBeanDefinitions(Set<BeanDefinitionHolder> holders) {
		for (BeanDefinitionHolder holder : holders) {
			// 在这里修改BeanDefinition引用的对象即可
			GenericBeanDefinition definition = (GenericBeanDefinition) holder.getBeanDefinition();
			// 只能拿到接口名, 不能拿到Class对象, 因为此时还没有被类加载器加载
			String mapperInterfaceName = definition.getBeanClassName();
			definition.setBeanClass(MyFactoryBean.class);
			// 使用构造函数注入
			// 这里给的只是接口的完全限定名, 而不是Class对象, 因为Spring初始化的时候
			// 会自动将字符串转化成对应的类型, 而对应这里将会使用的是ClassEditor转化功能.
			// 之所以不用Class, 是因为对应Class文件此时还没有被类加载器加载
			definition.getConstructorArgumentValues().addGenericArgumentValue(mapperInterfaceName);
		}
	}
}
