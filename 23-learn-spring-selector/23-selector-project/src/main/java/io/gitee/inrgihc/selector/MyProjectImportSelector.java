package io.gitee.inrgihc.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import io.gitee.inrgihc.selector.config.MyProjectConfig;

public class MyProjectImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{MyProjectConfig.class.getName()};
	}

}
