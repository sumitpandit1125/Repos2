package com.training.DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Doctor;
import com.training.iface.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor> {

	@Override
	public Object add(Doctor t) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		int key = (int)session.save(t);
			
		tx.commit();
		session.close();
		factory.close();
		return key;
	}

	@Override
	public Doctor find(Object obj) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		int key = (int)obj;
		
		Doctor doc = (Doctor)session.get(Doctor.class, key);
				
		session.close();
		factory.close();
		return doc;
	}

	@Override
	public List<Doctor> findAll() {
		
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		
		List<Doctor> docList = session.createQuery("from Doctor").list();
				
		session.close();
		factory.close();
		return docList;
	}

	@Override
	public Object update(Doctor t) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Doctor doc = (Doctor) session.load(Doctor.class, t.getDoctorCode());
		doc.setDoctorName("sumit");
		session.update(doc);
		
		
	    
		tx.commit();
		session.close();
		factory.close();
		return doc;
	}

	@Override
	public boolean delete(Object obj) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Boolean flag = false;
		Doctor doc = (Doctor) session.get(Doctor.class, (Serializable)obj);
		
		if (doc != null) {
	        session.delete(doc);
	        flag = true;
	    }
	    
		tx.commit();
		session.close();
		factory.close();
		return flag;
	}

}
