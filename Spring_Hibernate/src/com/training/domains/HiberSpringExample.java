package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.iface.MyDAO;

public class HiberSpringExample extends HibernateDaoSupport implements MyDAO<Doctor> {
	
	
	
	@Override
	public Serializable add(Doctor t) {
		Serializable key = getHibernateTemplate().save(t);
		
		return key;
	}

	@Override
	public Doctor find(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Doctor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
