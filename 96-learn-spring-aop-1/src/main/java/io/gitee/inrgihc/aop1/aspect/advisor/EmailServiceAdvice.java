package io.gitee.inrgihc.aop1.aspect.advisor;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmailServiceAdvice {
/*
	@Before("io.gitee.inrgihc.aop1.aspect.pointcut.EmailServiceAspect.sayPointCut()")
	public void beforSay() {
		System.out.println("befor say()..........");
	}

	@After("io.gitee.inrgihc.aop1.aspect.pointcut.EmailServiceAspect.sayPointCut()")
	public void afterSay() {
		System.out.println("after say()..........");
	}

	@AfterReturning(pointcut = "io.gitee.inrgihc.aop1.aspect.pointcut.EmailServiceAspect.sayPointCut()", returning = "ret")
	public void afterReturningSay(String ret) {
		System.out.println("after say() return :........." + ret);
	}

	@Around("io.gitee.inrgihc.aop1.aspect.pointcut.EmailServiceAspect.sayPointCut()")
	public Object aroundSay(ProceedingJoinPoint point) {
		Object ret = null;
		System.out.println("--------say()..........");
		System.out.println(Arrays.asList(point.getArgs()));
		try {
			ret = point.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("--------say()--------------" + ret);
		return ret;
	}
*/
}
