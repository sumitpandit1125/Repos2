package com.training.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.DAO.DoctorDAO;
import com.training.entity.Address;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

public class FirstApplication {
	
	public static void main(String[] args) {
		
		
		/*SessionFactory factory = HiberUtils.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Address res = new Address("naskarhat", "rabindrapally");
		
		Address cl = new Address("Sector 21", "Dundahera");
		
		Doctor doc = new Doctor(104, "Pritam", 9874563214l,res,cl);
		
		 int key = (int)session.save(doc);
		 
		//Doctor doc2 = (Doctor) session.get(Doctor.class, 101); 
		 
		 System.out.println(key);
		
		tx.commit();
		
		factory.close();		*/
		
		/*Address res = new Address("naskarhat", "rabindrapally");
		Address cl = new Address("Sector 21", "Dundahera");
		Doctor doc = new Doctor(105, "Rahman", 9874563214l,res,cl);
		
		DoctorDAO docDAO = new DoctorDAO();
		int key = (int)docDAO.add(doc);
		System.out.println(key);*/
		
		DoctorDAO docDAO = new DoctorDAO();
		Doctor doc = new Doctor();
		doc.setDoctorCode(104);
		docDAO.update(doc);
		System.out.println(doc);
		System.out.println(docDAO.find(104));
		
				
	}	

}
