package com.ly.DemoSpringBoot.dao.daoImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ly.DemoSpringBoot.dao.Tese;
import com.ly.DemoSpringBoot.entiy.ProjectCatagory;

@Repository
public class TestImpl implements Tese {

	 @Autowired
	    private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public int add(ProjectCatagory pc) {
		String sql="insert into family(id,family) values(:id,:family)";
		 Map<String, Object> param = new HashMap<>();
	        param.put("id", 10);
	        param.put("family", "名字");
	        
	        return (int) jdbcTemplate.update(sql, param);
	}

}
