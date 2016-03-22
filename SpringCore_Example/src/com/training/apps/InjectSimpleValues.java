package com.training.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.training.domains.Customer;
import com.training.domains.Invoice;

public class InjectSimpleValues {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext container = new ClassPathXmlApplicationContext("bean3.xml");
		
//		Customer cust1 = (Customer) container.getBean("custBean1");
//		
//		Customer cust2 = container.getBean("custBean1", Customer.class);
//		
//		Customer cust3 = container.getBean(Customer.class);
//		
//		System.out.println(cust1 +"\n"+ cust2 +"\n"+ cust3);
//		System.out.println(cust1.equals(cust2) +" "+ cust2.hashCode() +" "+ cust3.hashCode());
		
		Invoice inv1 = container.getBean(Invoice.class);
		System.out.println(inv1);
		container.close();
	
		
	}

}
