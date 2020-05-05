package io.gitee.inrgihc.spribatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.spribatis.config.MyAppConfig;

/**
 * 于Spring提供的包扫描设施来写一个简单的例子来模仿MyBatis-Spring扫描Mapper接口，生成代理注册到容器中。
 * <p>
 * https://www.cnblogs.com/wt20/p/10990697.html
 * </p>
 * 
 * @author tang
 *
 */
public class SpringMybatisApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyAppConfig.class);
		context.refresh();
		Object o = context.getBean("userMapper");
		System.out.println(o.toString());
	}

}
