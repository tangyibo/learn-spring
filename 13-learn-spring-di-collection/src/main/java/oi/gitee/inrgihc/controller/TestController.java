package oi.gitee.inrgihc.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import oi.gitee.inrgihc.service.ITestService;

@Component
public class TestController {

	@Autowired
	private Map<String,ITestService> ts;

	public void run() {
		Iterator<Entry<String, ITestService>> it=ts.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, ITestService> entry=it.next();
			entry.getValue().test();
		}
	}
}
