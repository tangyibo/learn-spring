package io.gitee.inrgihc.selector.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.selector.app.config.AppConfig;

/**
 * 参考教程：https://www.cnblogs.com/niechen/p/9262452.html
 * 
 * @author tang
 *
 */
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Object o=ac.getBean("testBean");
		System.out.println(o);
	}

}
