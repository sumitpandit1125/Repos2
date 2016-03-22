package com.training.entity;

import java.io.Serializable;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component("department")
public class Department implements Serializable {
	
	private String deptName;
	private Set<Student> stuSet;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, Set<Student> stuSet) {
		super();
		this.deptName = deptName;
		this.stuSet = stuSet;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<Student> getStuSet() {
		return stuSet;
	}
	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", stuSet=" + stuSet + "]";
	}
	
}
