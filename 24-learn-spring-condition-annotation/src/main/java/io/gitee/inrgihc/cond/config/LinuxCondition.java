package io.gitee.inrgihc.cond.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String property = context.getEnvironment().getProperty("os.name");
		if (property.toLowerCase().contains("linux")) {
			return true;
		}

		return false;
	}

}
