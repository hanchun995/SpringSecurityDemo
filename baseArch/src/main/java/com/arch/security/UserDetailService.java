package com.arch.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.arch.domain.UserInfoVo;

public class UserDetailService implements UserDetailsService{

	
	/**
	 * ���ﴫ�����û�������Ҫ�ڴ�����֤��������ʵ����UserDetails�ӿڵ��û�VO
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
