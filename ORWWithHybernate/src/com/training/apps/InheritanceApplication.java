package com.training.apps;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.training.entity.InPatient;
import com.training.utils.HiberUtils;

public class InheritanceApplication {

	public static void main(String[] args) {

		SessionFactory factory = HiberUtils.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Timestamp date = new Timestamp(new Date().getTime());
		
		InPatient patient = new InPatient("Ramesh", 25, "D4", date);
		
		session.save(patient);
		tx.commit();
		factory.close();
		
	}

}
