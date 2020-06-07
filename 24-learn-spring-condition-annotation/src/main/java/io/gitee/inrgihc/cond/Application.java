package io.gitee.inrgihc.cond;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.gitee.inrgihc.cond.config.AppConfig;
import io.gitee.inrgihc.cond.service.CommandShell;

/**
 * 条件注解
 * 
 * @author tang
 *
 */
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		CommandShell bean=ctx.getBean(CommandShell.class);
		System.out.println(bean);
		System.out.println(bean.command());
	}

}
