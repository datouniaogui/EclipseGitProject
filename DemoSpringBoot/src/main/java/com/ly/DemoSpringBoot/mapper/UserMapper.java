package com.ly.DemoSpringBoot.mapper;

import java.lang.annotation.Inherited;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ly.DemoSpringBoot.entiy.User;
@Mapper
//@Component
//@Repository
public interface UserMapper {
	public int addSave(User user);
}
