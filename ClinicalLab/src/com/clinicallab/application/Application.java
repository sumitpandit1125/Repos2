package com.clinicallab.application;

import com.clinicallab.entity.*;

import oracle.sql.DATE;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import com.clinicallab.dao.*;

public class Application {

	public static void main(String[] args) {
		/*
		Users usr = new Users(101, "pandit", "pandit", Role.RECEPTIONIST, "ACTIVE", "KOL123");
		UsersDAO usrDAO = new UsersDAO();
		if(usrDAO.validate(usr)){
			System.out.println("Success");
		}
		else{
			System.out.println("Fail");
		}
		*/
		PatientDAO patDAO = new PatientDAO();
		List<Patient> patList = patDAO.findAll();
		for( Patient pat:patList){
			System.out.println(pat.getId() + pat.getDOB().toString());
		}
		
	}

}
