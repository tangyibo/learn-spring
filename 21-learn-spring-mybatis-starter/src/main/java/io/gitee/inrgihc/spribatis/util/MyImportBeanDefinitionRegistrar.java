package io.gitee.inrgihc.spribatis.util;

import java.util.Map;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import io.gitee.inrgihc.spribatis.annotation.MyMapper;
import io.gitee.inrgihc.spribatis.annotation.MyMapperScan;


public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//通过注解@MyMapperScan获取到配置的扫描包的名称，然后进行包扫描，并注册为IoC容器的 bean
		Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(MyMapperScan.class.getName());
		String packageName=(String) attributes.get("value");
		MyClassPathMapperScanner scanner = new MyClassPathMapperScanner(registry);
		scanner.addIncludeFilter(new AnnotationTypeFilter(MyMapper.class));
        scanner.scan(packageName);
	}

}
