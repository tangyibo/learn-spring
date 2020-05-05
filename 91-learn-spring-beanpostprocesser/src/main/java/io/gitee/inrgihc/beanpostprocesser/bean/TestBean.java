package io.gitee.inrgihc.beanpostprocesser.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("testbean")
public class TestBean {

	private DemoBean bean;
	
	@Autowired
	public void myTestBean(DemoBean bean) {
		this.bean=bean;
	}
	
	public void showBean() {
		System.out.println(this.bean.toString());
	}
}
