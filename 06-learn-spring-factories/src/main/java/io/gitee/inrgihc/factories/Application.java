package io.gitee.inrgihc.factories;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import io.gitee.inrgihc.factories.service.SendService;

/**
 * Spring的META-INF/spring.factories解耦使用学习
 * 
 * @author tang
 *
 */
public class Application {

	private static <T> List<T> createFactoriesInstances(Class<T> type, Class<?>[] parameterTypes,
			ClassLoader classLoader, Object[] args, Set<String> names) {
		List<T> instances = new ArrayList<>(names.size());
		for (String name : names) {
			try {
				Class<?> instanceClass = ClassUtils.forName(name, classLoader);
				Assert.isAssignable(type, instanceClass);
				Constructor<?> constructor = instanceClass.getDeclaredConstructor(parameterTypes);
				T instance = (T) BeanUtils.instantiateClass(constructor, args);
				instances.add(instance);
			} catch (Throwable ex) {
				throw new IllegalArgumentException("Cannot instantiate " + type + " : " + name, ex);
			}
		}
		return instances;
	}

	public static void main(String[] args) {
		ClassLoader cl = Application.class.getClassLoader();
		List<String> implClassNames = SpringFactoriesLoader.loadFactoryNames(SendService.class, cl);
		implClassNames.stream().forEach(System.out::println);

		Set<String> names = new LinkedHashSet<>(implClassNames);
		List<SendService> instances = createFactoriesInstances(SendService.class, new Class<?>[] {}, cl,
				new Object[] {}, names);
		instances.stream().forEach((o) -> o.test());
	}

}
