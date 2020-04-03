package com.ly.DemoSpringBoot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ly.DemoSpringBoot.entiy.User;
import com.ly.DemoSpringBoot.mapper.UserMapper;
import com.ly.DemoSpringBoot.service.IUserService;

@SpringBootTest
public class UserTest {
	
	
	@Autowired
	IUserService userService;
	
	@Autowired
	UserMapper UserMapper;
	
	@Test
	public void addSave() {
		
		User user=new User();
 		user.setName("周23333");
		user.setUsername("");
		user.setPassword("909091");
		int result=userService.addSave(user);
		System.err.println("result:"+result);
	}
	
	
	
		
	

}
