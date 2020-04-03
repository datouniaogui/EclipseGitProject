package com.ly.DemoSpringBoot.entiy;

import java.util.Date;

public class ProjectCatagory {

	private long catagory_id;
	private String catagory_name;
	private String create_by;
	private Date  create_time;
	private String update_by;
	private Date update_time;
	private char zcgs;
	private char status;
	private String remark;
	public long getCatagory_id() {
		return catagory_id;
	}
	public void setCatagory_id(long catagory_id) {
		this.catagory_id = catagory_id;
	}
	public String getCatagory_name() {
		return catagory_name;
	}
	public void setCatagory_name(String catagory_name) {
		this.catagory_name = catagory_name;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public char getZcgs() {
		return zcgs;
	}
	public void setZcgs(char zcgs) {
		this.zcgs = zcgs;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "projectCatagory [catagory_id=" + catagory_id + ", catagory_name=" + catagory_name + ", create_by="
				+ create_by + ", create_time=" + create_time + ", update_by=" + update_by + ", update_time="
				+ update_time + ", zcgs=" + zcgs + ", status=" + status + ", remark=" + remark + "]";
	}
	
	
}
