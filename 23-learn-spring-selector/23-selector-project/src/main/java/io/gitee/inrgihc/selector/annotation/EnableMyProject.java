package io.gitee.inrgihc.selector.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import io.gitee.inrgihc.selector.MyProjectImportSelector;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import(MyProjectImportSelector.class)
public @interface EnableMyProject {

}
