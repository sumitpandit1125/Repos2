package com.training.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.dao.DAO;
import com.training.entity.Department;
import com.training.entity.Student;


@Controller
@RequestMapping("/dept")
public class DeptController{

	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student stu;
	
	@Autowired
	private Department dept;
	
	@Autowired
	private DAO dao;
	
	
	@RequestMapping("/addStudent")
	public ModelAndView addingStudent(){
		mdl.setViewName("addStudent");
		mdl.addObject("command",stu);
		return mdl;
	}
	
	@RequestMapping("/addDepartment")
	public ModelAndView addingDepartment(){
		mdl.setViewName("addDepartment");
		mdl.addObject("command", dept);
		return mdl;
	}
	
	@RequestMapping(value = "/display/{dept1}", method = RequestMethod.GET)
	public ModelAndView display(@PathVariable String dept1){
		mdl.setViewName("display");
		List<Student> stuList = null;
		if(!dept1.equals("blank"))
			stuList = dao.showToppers(dept1);
		
		mdl.addObject("toppers",stuList);
		return mdl;
	}
	
	@RequestMapping(value = "/addStudent" , method = RequestMethod.POST)
	public ModelAndView addingStudentSuccess(@ModelAttribute("student") Student stud, HttpServletRequest request){
		mdl.setViewName("success");
		String department = request.getParameter("department");
		Serializable key = dao.addStudent(stud,department);
		String str = "Student Added Successfully " + "Newly added student Id is : " + key; 
		mdl.addObject("msg",str);
		return mdl;
	}
	
	@RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
	public ModelAndView addingDepartmentSuccess(@ModelAttribute("department") Department dept){
		mdl.setViewName("success");
		Serializable key = dao.addDepartment(dept);
		String str = "Student Added Successfully " + "Newly added department is : " + key;
		mdl.addObject("msg", str);
		return mdl;
	}
	
	@ModelAttribute("departments")
	public List<String> subjects(){
		
		List<String> deptList = new ArrayList<String>() ;
		List<Department> departments = dao.getDepartment();
		for(Department d : departments){
			deptList.add(d.getDeptName());
		}
		return deptList;
		
	}
	
	
}
