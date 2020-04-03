package com.ly.DemoSpringBoot.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.DemoSpringBoot.entiy.Student;

@Controller
public class HelloWordController {
	

	@ResponseBody
	@RequestMapping("hello")
	public String hello(HttpServletRequest request) {
		String ni=request.getParameter("ni");
		
	    Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String string : entry.getValue()) {
                System.out.println(string);
            }
            System.out.println("----------------");
        }
		return "Hello Word\\Hello LiJian";
	}
	
	@RequestMapping("hi")
	public String hi(Map<String, Object> map) {
		System.err.println("888");
		map.put("msg", "thymeleaf 演示！");
		Student student=new Student();
		
		return "result";
	}
	
}
