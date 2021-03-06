package com.zheng.springboot.service;

import com.zheng.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ZhangShuzheng on 2016/11/17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate primaryJdbcTemplate;

	@Override
	public void create(String name, Integer age) {
		primaryJdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
	}

	@Override
	public void deleteByName(String name) {
		primaryJdbcTemplate.update("delete from USER where NAME = ?", name);
	}

	@Override
	public List getAllUsers() { return primaryJdbcTemplate.queryForList("select * from USER"); }

	@Override
	public void deleteAllUsers() {
		primaryJdbcTemplate.update("delete from USER");
	}

}
