package io.gitee.inrgihc.spribatis.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Object> {

	private Class<?> mapper;

	public MyFactoryBean(Class<?> mapper) {
		if (mapper == null || !mapper.isInterface()) {
			throw new IllegalArgumentException(mapper + "must be a interface.");
		}

		this.mapper = mapper;
	}

	@Override
	public Object getObject() throws Exception {
		Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] { this.mapper },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						if (Object.class.equals(method.getDeclaringClass())) {
							return method.invoke(this, args);
						}

						System.out.println(method.getName());
						return null;
					}

				});

		return obj;
	}

	@Override
	public Class<?> getObjectType() {
		return mapper;
	}

}
