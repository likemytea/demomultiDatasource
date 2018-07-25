package com.chenxing.demoshardingjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.chenxing.demoshardingjdbc.dao.base.MyJdbcTemplate;

/**
 * Description:ceshi
 * 
 * @author liuxing
 * @date 2018年5月9日
 * @version 1.0
 */
@Repository
public class Test02Dao {
	@Autowired
	@Qualifier("myJdbcTemplatep2")
	private MyJdbcTemplate myjdbcTemplate2;


	public int updateNametest2(String id, String name) {
		String sql = "update test_01 set name=? where id=?";
		int rs = myjdbcTemplate2.update(sql, name + "test2", id);
		return rs;
	}

}