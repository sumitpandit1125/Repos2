package com.clinicallab.entity;

import java.sql.Date;

public class Patient{
	
	
	private Integer id;
	private String name;
	private Long mobile;
	private String sex;
	private String address;
	private Date dOB;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer id, String name, Long mobile, String sex, String address, Date dOB) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.sex = sex;
		this.address = address;
		this.dOB = dOB;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDOB() {
		return dOB;
	}
	public void setDOB(Date dOB) {
		this.dOB = dOB;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", mobile=" + mobile + ", sex=" + sex + ", address=" + address
				+ ", dOB=" + dOB + "]";
	}
	
}
