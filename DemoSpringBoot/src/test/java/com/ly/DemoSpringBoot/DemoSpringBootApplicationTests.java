package com.ly.DemoSpringBoot;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ly.DemoSpringBoot.dao.Tese;
import com.ly.DemoSpringBoot.entiy.ProjectCatagory;
import com.ly.DemoSpringBoot.entiy.Student;
import com.ly.DemoSpringBoot.mapper.DealDataMapper;

@SpringBootTest
class DemoSpringBootApplicationTests {
	
	@Autowired
	Student student;
	
/*	@Autowired
	DealDataMapper dealData;*/
	
	@Autowired
	Tese tdao;
	
/*	@Test
	void contextLoads() {
//		System.err.println(student);
		ProjectCatagory pc=new ProjectCatagory();
		pc.setRemark("记号");
		pc.setCatagory_name("名字");
//		dealData.projectCatagory(pc);
		
		tdao.add(pc);
		
		
	}
	
	@Test
	void test1() {
		System.err.println("\"touser\" : \"OPENIDS\",");
		System.err.println("\\");
		System.err.println("<div class=\\\"gray\\\">值班类型: DUTYTYPE</div>\n");
	}

	@Test
	public void toString1() {
		StringBuilder msg = new StringBuilder();
		msg.append("{");
		msg.append("\"touser\" : \"OPENIDS\",".replace("OPENIDS","888888"));
		msg.append("\"msgtype\" : \"MSGTYPE\",".replace("MSGTYPE", "888888"));
		msg.append("\"agentid\" : AGENTID,".replace("AGENTID", "888888"));
		msg.append("\"MSGTYPE\" : ".replace("MSGTYPE", "888888"));
		msg.append("{\"title\" : \"TITLE\",".replace("TITLE", "888888"));
		msg.append("\"description\" : \"");
		msg.append("<div class=\\\"gray\\\">CURRENTTIME</div>".replace("CURRENTTIME", "888888"));
		msg.append("<div class=\\\"gray\\\">INFORMATION</div>\n\n".replace("INFORMATION", "888888"));
		msg.append("<div class=\\\"gray\\\">值班人员: DUTYUSER</div>\n".replace("DUTYUSER", "888888"));
		msg.append("<div class=\\\"gray\\\">值班类型: DUTYTYPE</div>\n".replace("DUTYTYPE",
				"888888"));
		msg.append("<div class=\\\"gray\\\">值班时间: DUTYTIME</div>\n".replace("DUTYTIME", "888888"));
		msg.append("\"");
		msg.append("\"url\":\"URL\"".replace("URL", "urlssss"));
		msg.append("},");
		msg.append("\"enable_id_trans\": 0,");
		msg.append("\"enable_duplicate_check\": 0");
		msg.append("}");
		
		System.err.println( msg.toString());
	}
	
	@Test
	public void toString2() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		
		System.err.println(sdf.format(new Date())+" 20:30:00 至 "+sdf.format(calendar.getTime())+" 20:30:00");
	}
	
	@Test
	public void toString3() {
		StringBuilder msg = new StringBuilder();
		msg.append("{\n");
		msg.append("\"touser\" : \"OPENIDS\",\n".replace("OPENIDS","88888"));
		msg.append("\"msgtype\" : \"MSGTYPE\",\n".replace("MSGTYPE", "88888"));
		msg.append("\"agentid\" : AGENTID,\n".replace("AGENTID", "88888"));
		msg.append("\"MSGTYPE\" : ".replace("MSGTYPE","88888"));
		msg.append("{\n");
		msg.append("\"content\" : \"");
		msg.append("INFORMATION\n".replace("INFORMATION", "88888"));
		msg.append(">值班人员:<font color=\\\"info\\\">DUTYUSER</font>\n".replace("DUTYUSER", "88888"));
		msg.append(">值班类型:<font color=\\\"info\\\">DUTYTYPE</font>\n".replace("DUTYTYPE", "88888"));
		msg.append(">值班时间:<font color=\\\"info\\\">DUTYTIME</font>".replace("DUTYTIME", "88888"));
		msg.append("\"");
		msg.append("},\n");
		msg.append("\"enable_duplicate_check\": 0\n");
		msg.append("}");
		
		System.err.println( msg.toString());
	}*/
	
	@Test
	public void ttttt() {
		
		Double tDouble=0.1;
		if(tDouble>0) {
			System.err.println("ok");
		}else {
			System.err.println("no");
		}
		
	}
	
}
