package com.arch.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.arch.domain.UserInfoVo;

public class UserDetailService implements UserDetailsService{

	
	/**
	 * 这里传过来用户名，需要在此作验证，并返回实现了UserDetails接口的用户VO
	 */
	@Override
	public UserDetails loadUserByUsername(String username){
		UserInfoVo user = new UserInfoVo();
		System.out.println(user);
		user.setUsername(username);
		user.setPassword("admin");
		return user;
	}

}
