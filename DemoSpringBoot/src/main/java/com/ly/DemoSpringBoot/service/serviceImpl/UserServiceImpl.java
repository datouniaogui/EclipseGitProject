package com.ly.DemoSpringBoot.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.DemoSpringBoot.entiy.User;
import com.ly.DemoSpringBoot.mapper.UserMapper;
import com.ly.DemoSpringBoot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public int addSave(User user) {
	
		return userMapper.addSave(user);
	}

}
