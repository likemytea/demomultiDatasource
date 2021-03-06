package com.chenxing.demoshardingjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chenxing.common.redis.RedisService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoshardingjdbcApplicationTests {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RedisService redisService;

	public void sethash() {
		log.info("aaaaaaaaa");
		redisService.setHash();
	}

	@Test
	public void gethash() {
		log.info("bbbbbb");
		redisService.getHash();
	}
}
