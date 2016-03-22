package com.training.apps;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.InvoiceDAOImplementation;
import com.training.dao.ServiceRequestDAO;
import com.training.entity.Customer;
import com.training.entity.Invoice;
import com.training.entity.Item;
import com.training.entity.ServiceRequest;

public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("bean2.xml");
		
		/*InvoiceDAOImplementation obj = ctx.getBean("dao",InvoiceDAOImplementation.class);
		Invoice inv = ctx.getBean("invoice",Invoice.class);
		
		inv.setInvoiceNumber(202);
		inv.setCustomerName("Sumit");
		inv.setAmount(900.00);
		
		boolean result = obj.add(inv);
		
		System.out.println("Row Added : "+ result);
		
		List<Invoice> invList = obj.findAll();
		for(Invoice inv1:invList)
		System.out.println(inv1);*/
		
		ServiceRequestDAO reqDao = ctx.getBean("dao",ServiceRequestDAO.class);
		ServiceRequest req = ctx.getBean("serviceRequest", ServiceRequest.class);
		Customer cust = ctx.getBean("customer",Customer.class);
		Item item = ctx.getBean("item",Item.class);
		
		item.setProductType("Mobile");
		
		cust.setCutomerName("Rahman");
		cust.setPhoneNumber(9874563214l);
		
		req.setCust(cust);
		req.setProduct(item);
		req.setRequestId(102);
		req.setDescription("hangs always");
		req.setDateOfRequest(Date.valueOf("2016-2-2"));
		
		//System.out.println("Request Added : "+reqDao.add(req));
		
		//req = ;
		System.out.println(reqDao.findAll());
				
	}

}
