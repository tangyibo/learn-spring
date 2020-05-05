package io.gitee.inrgihc.aop1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("io.gitee.inrgihc.aop1")
@EnableAspectJAutoProxy
public class MyAppConfig {

}
