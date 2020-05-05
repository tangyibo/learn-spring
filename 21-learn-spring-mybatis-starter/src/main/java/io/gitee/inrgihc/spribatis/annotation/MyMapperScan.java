package io.gitee.inrgihc.spribatis.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import io.gitee.inrgihc.spribatis.util.MyImportBeanDefinitionRegistrar;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {
	String value() default "";
}
