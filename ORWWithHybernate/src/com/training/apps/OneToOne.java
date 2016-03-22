package com.training.apps;


import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;

import com.training.entity.Address;
import com.training.entity.Assistant;
import com.training.entity.Doctor;
import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class OneToOne {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HiberUtils.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx1 = session.beginTransaction();
		
		/*Address res = new Address("naskarhat", "rabindrapally");
		
		Address cl = new Address("Sector 21", "Dundahera");
		
		Assistant asst = new Assistant(102, "shamu");
		
		Set<Patient> patList = new HashSet<Patient>();
		
		Timestamp date = new Timestamp(new Date().getTime());		
		patList.add(new InPatient("Mahesh5", 25,"D1",date));
		patList.add(new InPatient("Mahesh6", 26,"D2",date));
		patList.add(new InPatient("Mahesh7", 27,"D3",date));
		patList.add(new InPatient("Mahesh8", 28,"D6",date));
		
		Doctor doc = new Doctor(107, "Srivatsan", 9874563214l,res,cl,asst,patList);
		
		 int key = (int)session.save(doc);
		 
		
		 
		System.out.println(key);*/
		
		Doctor doc = (Doctor)session.get(Doctor.class, 107);	
		System.out.println(doc.getPatientList());
		
		tx1.commit();		
		session.close();		
	
		
	}
	
	
}
