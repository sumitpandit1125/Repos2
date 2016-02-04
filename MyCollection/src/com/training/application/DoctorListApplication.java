package com.training.application;

import java.util.TreeSet;

import com.training.domains.Doctor;
import com.training.domains.NursingHome;
import com.training.domains.Patient;

public class DoctorListApplication {

	public static void main(String[] args) {
		
		Doctor doc1 = new Doctor(101, "Ramesh", "Dentist");
		Doctor doc2 = new Doctor(105, "Suresh", "Surgeon");
		Doctor doc3 = new Doctor(102, "Mahesh", "Gyno");
		
		NursingHome nur = new NursingHome();
		
		Patient pat1 = new Patient(201, "Tom", 896523);
		Patient pat2 = new Patient(202, "Dick", 896523);
		Patient pat3 = new Patient(201, "Harry", 896523);
		
		TreeSet<Patient> pat = new TreeSet<Patient>();
		
		pat.add(pat1);
		pat.add(pat2);
		
		System.out.println(pat.add(pat3));
		doc1.setPat(pat);
		
		
		nur.addDoctor(doc1);
		nur.addDoctor(doc2);
		nur.addDoctor(doc3);
		
		nur.printSortedDoctor(1);	
		
		
		
	}

}
