package io.gitee.inrgihc.event.service;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import io.gitee.inrgihc.event.event.BlackListEvent;

@Component
public class EmailService implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	private List<String> blackList;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}

	public void sendEmail(String address) {
		if (blackList.contains(address)) {
			publisher.publishEvent(new BlackListEvent(this, address));
			return;
		}

		System.out.println("send email to :" + address);
	}
}
