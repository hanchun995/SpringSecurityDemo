package com.arch.dao;

import com.arch.domain.UserInfoVo;

public interface UserDao {
	
	public int countAll(UserInfoVo user);
	
	public int insert(UserInfoVo user);
	
}
