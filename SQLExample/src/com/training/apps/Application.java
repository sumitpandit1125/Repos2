package com.training.apps;

import com.training.daos.CustomerDAO;

public class Application {

	public static void main(String[] args) {
		
		
		CustomerDAO custDAO = new CustomerDAO();
		System.out.println(custDAO.update(103));
		
		
	}
}
