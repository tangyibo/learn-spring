package io.gitee.inrgihc.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.redis.core.StringRedisTemplate;

@RestController
public class TestController {

	@Autowired
	private StringRedisTemplate redisTemplate;

	// 测试：http://localhost:1088/redis/get/name
	@RequestMapping("/redis/get/{key}")
	private String get(@PathVariable("key") String key) {
		return redisTemplate.opsForValue().get(key);
	}

	// 测试：http://localhost:1088/redis/set/name/tang
	@RequestMapping("/redis/set/{key}/{value}")
	private Boolean set(@PathVariable("key") String key, @PathVariable("value") String value) {
		boolean flag = true;
		try {
			redisTemplate.opsForValue().set(key, value);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
}
