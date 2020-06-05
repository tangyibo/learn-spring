package io.gitee.inrgihc.myproperty.init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestAppPropertiesValue implements ApplicationRunner {

    @Value("${test.item.xxx}")
    private String xxx;

    @Value("${test.item.yyy}")
    private String yyy;

    @Value("${test.item.zzz}")
    private String zzz;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
        System.out.println(xxx);
        System.out.println(yyy);
        System.out.println(zzz);
	}

}
