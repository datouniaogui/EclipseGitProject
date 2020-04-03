package com.ly.DemoSpringBoot.entiy;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//@ConfigurationProperties(prefix="student")
@Component //将此javabeen放入spring容器
@Validated //开启jsr303数据校验的注解
//@PropertySources(value= )
public class Student {
	
	@Email
	@Value("${student.email}")
	private String email;
	@Value("${student.uname}")
	private String name;
	@Value("30")
	private int age;
	private boolean sex;
	private Date birthday;
	private Map<String, String> location;
	private String[] hobbies;
	private List<String> skills;
	private Pet pet;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Map<String, String> getLocation() {
		return location;
	}
	public void setLocation(Map<String, String> location) {
		this.location = location;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday
				+ ", location=" + location + ", hobbies=" + Arrays.toString(hobbies) + ", skills=" + skills + ", pet="
				+ pet + "]";
	}
}
