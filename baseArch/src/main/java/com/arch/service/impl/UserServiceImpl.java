package com.arch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arch.dao.CommonDao;
import com.arch.dao.UserDao;
import com.arch.domain.UserInfoVo;
import com.arch.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private CommonDao dao;
	
	public List<UserInfoVo> listAll(UserInfoVo user) {
		List<UserInfoVo> users = dao.selectList("user.mapper.selectAll", user);
		return users;
	}

	public int insert(UserInfoVo user) {
		int i = dao.insert("user.mapper.insert", user);
		return i;
	}

}
