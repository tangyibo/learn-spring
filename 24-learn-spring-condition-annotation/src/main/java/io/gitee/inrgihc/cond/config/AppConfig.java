package io.gitee.inrgihc.cond.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import io.gitee.inrgihc.cond.service.CommandShell;
import io.gitee.inrgihc.cond.service.LinuxCommandShell;
import io.gitee.inrgihc.cond.service.WindowsCommandShell;

/**
 * 条件注解的使用与配置
 * @author suntang
 *
 */
@Configuration
public class AppConfig {
	/*
	// 配置方式一：函数式配置
	@Bean("cmd")
	@Conditional(value = { WindowsCondition.class })
	public CommandShell winCommand() {
		return new WindowsCommandShell();
	}

	@Bean("cmd")
	@Conditional(value = { LinuxCondition.class })
	public CommandShell linuxCommand() {
		return new LinuxCommandShell();
	}
	 */
	
	// 配置方式二：静态内部类配置
	@Configuration
	public static class WindowsAppConfig {

		@Bean
		@Conditional(value = { WindowsCondition.class })
		public CommandShell cmd() {
			return new WindowsCommandShell();
		}
	}

	@Configuration
	public static class LinuxAppConfig {

		@Bean
		@Conditional(value = { LinuxCondition.class })
		public CommandShell cmd() {
			return new LinuxCommandShell();
		}
	}
}
