package com.training.apps;

import java.util.ArrayList;
import com.training.daos.CustomerDAO;
import com.training.entity.Customer;

public class Application {

	public static void main(String[] args) {
		
		
		CustomerDAO custDAO = new CustomerDAO();
		System.out.println(custDAO.update(103));
		
		
	}
}
