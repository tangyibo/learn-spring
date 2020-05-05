package io.gitee.inrgihc.aop2;

import java.lang.reflect.Method;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@interface MyAnn {
}

interface EmailService {

	public String send(String s);
	
	@MyAnn
	public void test();
}

class MyEmailServiceImpl implements EmailService {

	@Override
	public String send(String s) {
		System.out.println("send message :" + s);
		return "ok";
	}

	@MyAnn
	@Override
	public void test() {
		System.out.println("this test function()" );
	}
}


public class Application {

	public static void main(String[] args) {

		// 构造切面的切入点Pointcut
		Pointcut myPointcut = new StaticMethodMatcherPointcut() {

			//切入点为：EmailService的实现类中，标记有@MyAnn注解的方法
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				if (targetClass.isAssignableFrom(EmailService.class) || method.isAnnotationPresent(MyAnn.class)) {
					return true;
				}

				return false;
			}
		};

		// 设置前置通知方式处理
		BeforeAdvice myBeforeAdvice = new MethodBeforeAdvice() {

			@Override
			public void before(Method method, Object[] args, Object target) throws Throwable {
				System.out.println("!!!!!!!!before advice :" + method.getName());
			}

		};
		
		PointcutAdvisor myAdvisor = new DefaultPointcutAdvisor(myPointcut, myBeforeAdvice);
		
		ProxyFactory factory = new ProxyFactory(new MyEmailServiceImpl());
		factory.addAdvisor(myAdvisor);
		EmailService service = (EmailService) factory.getProxy();
		service.send("xxxx");
		service.test();
	}

}
