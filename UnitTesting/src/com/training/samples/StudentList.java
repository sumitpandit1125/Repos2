package com.training.samples;

import java.util.HashSet;


public class StudentList {
	
	
	private HashSet<Student> stud; 
	
	
	public StudentList( HashSet<Student> stud) {
		super();
		
		this.stud = stud;
	}


	

	


	public HashSet<Student> getStud() {
		return stud;
	}


	public void setStud(HashSet<Student> stud) {
		this.stud = stud;
	}

	

}
