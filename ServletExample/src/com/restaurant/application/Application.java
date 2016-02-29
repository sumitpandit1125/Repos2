package com.restaurant.application;

import com.restaurant.daos.EmployeeDAO;
import com.restaurant.daos.UserDAO;
import com.restaurant.entity.Employee;
import com.restaurant.entity.Users;

public class Application {

	public static void main(String[] args) {
		
		/*Employee emp = new Employee(100, "Rehman", 9985689560L);
		EmployeeDAO empDAO = new EmployeeDAO();
		
		empDAO.add(emp);
		*/
		//empDAO.delete(101);
		
		Users usr = new Users(101, "sumit", "ADMIN");
		UserDAO usrDAO = new UserDAO();
		if(usrDAO.validateUser(usr)){
			System.out.println("ok");
		}
		
	}

}
