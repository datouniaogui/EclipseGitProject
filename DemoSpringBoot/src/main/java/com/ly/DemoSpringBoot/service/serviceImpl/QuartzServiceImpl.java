package com.ly.DemoSpringBoot.service.serviceImpl;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ly.DemoSpringBoot.service.quartzService;

@Component
@EnableScheduling
public class QuartzServiceImpl implements Job  {
	//任务
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		System.err.println("哇...真的执行了！");
		
	}

}
