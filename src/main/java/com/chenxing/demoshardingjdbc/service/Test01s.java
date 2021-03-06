package com.chenxing.demoshardingjdbc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenxing.demoshardingjdbc.dao.Test01Dao;
import com.chenxing.demoshardingjdbc.dao.Test02Dao;

@Service
public class Test01s {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Test01Dao test01Dao;
	@Autowired
	private Test02Dao test02Dao;
	public int updateName(String id, String name, int currentpage, int pagesize) {
		log.info("test yilaizhu");
		int count = 0;
		try {
			count = test01Dao.updateName(id, name);
			test02Dao.updateNametest2(id, name);
			test01Dao.updateNametest3(id, name);
			test01Dao.findMessage(id, name, currentpage, pagesize);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}
}
