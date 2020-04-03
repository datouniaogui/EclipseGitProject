package com.ly.DemoSpringBoot;

import org.junit.jupiter.api.Test;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.ly.DemoSpringBoot.service.serviceImpl.QuartzServiceImpl;

@SpringBootTest
public class QuartzTest {

	/*@Test
	void test() {
		try {
			// 产生实际使用的job
			JobBuilder jobBuilder = JobBuilder.newJob(QuartzServiceImpl.class);
			JobDetail job = jobBuilder.withIdentity("test job", "test tame").build();

			// 创建触发器Trigger(TriggerBuilder、scheduleBuilder)
			// TriggerBuilder
			TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
			triggerBuilder.withIdentity("test trigger", "test tame");
			triggerBuilder.startNow();
			
			
			

			// scheduleBuilder 定义执行周期、时机
			SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule();
			scheduleBuilder.withIntervalInSeconds(2);// 每隔2秒执行一次
			scheduleBuilder.withRepeatCount(7);// 重复执行10次

			// 产生触发器
			SimpleTrigger trigger = triggerBuilder.withSchedule(scheduleBuilder).build();

			// 创建调度器scheduler
			SchedulerFactory factory = new StdSchedulerFactory();

			// 调度
			Scheduler scheduler = factory.getScheduler();
			scheduler.scheduleJob(job, trigger);
			scheduler.start();
//			scheduler.shutdown();

			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/

}
