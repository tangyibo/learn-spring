package io.gitee.inrgihc.event.lisener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import io.gitee.inrgihc.event.event.BlackListEvent;

@Component
public class EventListenHandler {

	@EventListener({ContextRefreshedEvent.class})
	public void handleContextRefresh() {
		System.out.println("ApplicationContext is initialized or refreshed");
	}
	
	@EventListener({ContextStartedEvent.class})
	public void handleContextStart() {
		System.out.println("ApplicationContext is started by using the start() method");
	}
	
	@EventListener({BlackListEvent.class})
	@Order(1)
	public void handleBlackList(BlackListEvent event) {
		System.out.println("black:" + event.getAddress());
	}
	
	@EventListener({BlackListEvent.class})
	@Order(2)
	public void handleBlackList2(BlackListEvent event) {
		System.out.println("black2:" + event.getAddress());
	}
}
