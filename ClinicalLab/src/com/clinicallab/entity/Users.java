package com.clinicallab.entity;

public class Users {
	
	private Integer id;
	private String userName;
	private String passWord;
	private Role role;
	private String status;
	private String lab;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Integer id, String userName, String passWord, Role role, String status, String lab) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.role = role;
		this.status = status;
		this.lab = lab;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	
}
