package com.restaurant.application;

import com.restaurant.daos.EmployeeDAO;
import com.restaurant.entity.Employee;

public class Application {

	public static void main(String[] args) {
		
		Employee emp = new Employee(100, "Rehman", 9985689560L);
		EmployeeDAO empDAO = new EmployeeDAO();
		
		empDAO.add(emp);
		
		//empDAO.delete(101);
		
	}

}
