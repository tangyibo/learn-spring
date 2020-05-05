package io.gitee.inrgihc.event.lisener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import io.gitee.inrgihc.event.event.BlackListEvent;

@Component
public class BlackListEventListener implements ApplicationListener<BlackListEvent> {

	@Override
	public void onApplicationEvent(BlackListEvent event) {
		System.out.println("black:" + event.getAddress()+"  source:"+event.getSource().toString());
	}

}
