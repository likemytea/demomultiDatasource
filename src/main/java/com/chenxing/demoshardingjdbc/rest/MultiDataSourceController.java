/**
 * 
 */
package com.chenxing.demoshardingjdbc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.chenxing.common.redis.RedisService;
import com.chenxing.demoshardingjdbc.entity.Test01;
import com.chenxing.demoshardingjdbc.service.Test01s;

/**
 * @author liuxing
 */
@RestController
public class MultiDataSourceController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RedisService redisService;

	@Autowired
	Test01s t;

	@RequestMapping(value = "/tt", method = RequestMethod.GET)
	public String tt(@RequestParam String id, @RequestParam String name) {
		long start = System.currentTimeMillis();
		String result = null;
		log.info(name);
		t.updateName(id, name, 1, 3);
		long end = System.currentTimeMillis();
		log.info("cost time =" + String.valueOf(end - start) + "毫秒！");
		return id + name;

	}

	@RequestMapping("/saveToRedis")
	public String saveToRedis() { // 这里用于测试，key值可以自定义实现
		Test01 t = new Test01();
		t.setId("safsd");
		t.setName("安吉lie");
		redisService.set("123456", t);
		return "SUCCESS";
	}

	@RequestMapping("/getFromRedis")
	public String getFromRedis() { // 这里用于测试，key值可以自定义实现
		// JSONObject jsonObject = (JSONObject) redisService.get("123456");
		return JSON.toJSONString(redisService.get("123456"));
	}
}