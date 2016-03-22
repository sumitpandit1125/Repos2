package com.training.dao;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.training.entity.Department;
import com.training.entity.Student;

@Component("dao")
public class DAO extends HibernateDaoSupport {
	
	@Autowired
	private SessionFactory fact;
	
	public Serializable addStudent(Student stud, String deptName){
		Serializable key = getHibernateTemplate().save(stud);
		Department dept = getHibernateTemplate().get(Department.class, deptName);
		Set<Student> stuSet = dept.getStuSet();
		stuSet.add(stud);
		getHibernateTemplate().update(dept);
		return key;
	}

	public Serializable addDepartment(Department dept){
		Serializable key = getHibernateTemplate().save(dept);
		return key;
	}
	
	public List<Student> showToppers(String dept){
		
		String hql = "SELECT d.stuSet FROM Department d WHERE d.deptName = :arg1 ORDER BY "
				+ "AcademicPerformance*0.5 + AcademicEvents*0.1 + CulturalActivities * 0.2 + SportsActivity * 0.2 "
				+ "DESC";
		Query query = fact.openSession().createQuery(hql);
		query.setString("arg1",dept);
		query.setMaxResults(3);
		List<Student> stuSet = (List<Student>) query.list();
		
		//Department dept1 = getHibernateTemplate().find(queryString)
		
		/*Department dept1 = getHibernateTemplate().get(Department.class, dept);
		List<Student> stuList = new ArrayList<Student>();
		Map<Double, String> topper = new TreeMap<Double,String>();
		
		for(Student stud:dept1.getStuSet()){
			stuList.add(stud);
			String value = stud.getStuName();
			Double key = stud.getAcademicPerformance()*0.5 + stud.getAcademicEvents()*0.1 + stud.getCulturalActivities() * 0.2 + stud.getSportsActivity() * 0.2;
			topper.put(key, value);
		}
		*/
		

		
		return stuSet;
		
		
	}
	
	public List<Department> getDepartment(){
		
		List<Department> deptList = (List<Department>) getHibernateTemplate().find("from Department");	
		return deptList;
	}

}
