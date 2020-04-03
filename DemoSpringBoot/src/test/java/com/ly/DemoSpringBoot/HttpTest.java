package com.ly.DemoSpringBoot;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.sf.json.JSONObject;

@SpringBootTest
public class HttpTest {

	@Test
	void testPost() {
		JSONObject jsonObject1 = new JSONObject();
		JSONObject jsonObject2 = new JSONObject();
		
		jsonObject2.put("deviceID", "110");
		jsonObject2.put("state", "0");
		jsonObject2.put("channel", "channel");
		jsonObject1.put("requestCommand", "control");
		
		String result=post(jsonObject1, "http://localhost:8889/hello?name=lijian&password=123");
		System.err.println("请求结果:"+result);
	}
	
	@Test
	void testGet() {
		
		String result=get("http://localhost:8889/hello?name=lijian&password=999");
		System.err.println("请求结果:"+result);
	}

	// post
	public String post(JSONObject json, String url) {
		String result = "";
		HttpPost post = new HttpPost(url);
		try {
		
			HttpClient httpClient = HttpClients.createDefault();
			post.setHeader("Content-Type","application/json;charset=utf-8");
			post.addHeader("Authorization", "Basic YWRtaW46");
			
			StringEntity postingString = new StringEntity(json.toString(),"utf-8");
			post.setEntity(postingString);
			
			HttpResponse response = httpClient.execute(post);
			
			InputStream in = response.getEntity().getContent();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
			StringBuilder strber= new StringBuilder();
			String line = null;

			while((line = br.readLine())!=null){
				strber.append(line+'\n');
			}
			br.close();
			in.close();
			result = strber.toString();
			
			if(response.getStatusLine().getStatusCode()!=HttpStatus.SC_OK){
				result = "服务器异常";
			}
			
		} catch (Exception e) {
			result = "请求异常";
			e.printStackTrace();
		}finally {
			post.abort();
		}

		return result;
	}
	
	
	//get
	public String get(String url) {
		String result="";
		HttpGet get=new HttpGet(url);
		HttpClient httpClient = HttpClients.createDefault();
		try {
			HttpResponse response = httpClient.execute(get);
			InputStream in = response.getEntity().getContent();
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
			StringBuilder strber=new StringBuilder();
			String line=null;
			while ((line=br.readLine())!=null) {
				strber.append(line+'\n');
			}
			br.close();
			in.close();
			
			result=strber.toString();
			if(response.getStatusLine().getStatusCode()!=HttpStatus.SC_OK) {
				result = "服务器异常";
			}
		}  catch (Exception e) {
			result="请求异常";
			e.printStackTrace();
		}finally {
			get.abort();
		}
		
		return result;
		
	} 
	
	//map->list
	public  List<NameValuePair> setHttpParams(Map<String, String> paramMap){
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		Set<Map.Entry<String, String>> set = paramMap.entrySet();
		for(Map.Entry<String, String> entry : set){
			params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		return params;
	}
	
	
	@Test
	void date() {
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DATE, -500);
		
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.err.println(simpleDateFormat.format(calendar.getTime()));
		System.err.println(calendar.getTime());
		System.err.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.err.println(calendar.get(Calendar.DAY_OF_MONTH));
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		
		
		try {
			
			Date date=sdf.parse("2020-04-02");
			Date date2 = sdf.parse("1993-12-12");
			
		   long num=(date.getTime()-date2.getTime())/(1000*60*60*24);
			System.err.println("num:"+num);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}


}
