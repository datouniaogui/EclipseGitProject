package com.ly.DemoSpringBoot.controller;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.DemoSpringBoot.entiy.User;
import com.ly.DemoSpringBoot.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	//你好

	@Autowired
	IUserService userService;

	@RequestMapping("/goAdd")
	public String goAdd() {

		System.err.println("go  add");
		return "user/add";
	}

	@PostMapping("/addSave")
	@ResponseBody
	public String addSave(HttpServletRequest request) {

		Map user = request.getParameterMap();
		Iterator entrys = user.entrySet().iterator();
		Map.Entry entry;
		String value = "";
		String key = "";
		while (entrys.hasNext()) {
			entry = (Map.Entry) entrys.next();
			key=(String)entry.getKey();
			Object valueObj=entry.getValue();
			
			if (null == valueObj) {
				value = "";
			} else if (valueObj instanceof String[]) {
				String[] values = (String[]) valueObj;
				System.err.println("String[] values:"+values);
				for (int i = 0; i < values.length; i++) {
					value = values[i] + ",";
				}
				System.err.println("value:"+value);
				value = value.substring(0, value.length() - 1);
			} else {
				value = valueObj.toString();
			}
			
			System.out.println("key:" + key);
			System.out.println("value:" +value);
			System.err.println("valueObj:"+valueObj);
		}

//		System.err.println("addSave");
//		System.err.println("user:" + user);

		User user2 = new User();
		/*
		 * user2.setName(name); int result =userService.addSave(user);
		 */

		return String.valueOf("1");
	}

}
