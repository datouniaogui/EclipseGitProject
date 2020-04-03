package com.ly.DemoSpringBoot.mapper;

import org.springframework.stereotype.Repository;

import com.ly.DemoSpringBoot.entiy.ProjectCatagory;

@Repository
public interface DealDataMapper {
	
	void projectCatagory(ProjectCatagory pc );

}
