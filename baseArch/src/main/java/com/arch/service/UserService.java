package com.arch.service;

import java.util.List;

import com.arch.domain.UserInfoVo;

public interface UserService {
	public List<UserInfoVo> listAll(UserInfoVo user);
	
	public int insert(UserInfoVo user);
}
