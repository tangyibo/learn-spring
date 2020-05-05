package io.gitee.inrgihc.aop1.aspect.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmailServiceAspect {

	@Pointcut("execution(* io.gitee.inrgihc.aop1.service.EmailService.*(..))")
	public void sayPointCut() {
		
	}
}
