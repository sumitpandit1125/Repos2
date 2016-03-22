package com.training.apps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;

public class SimpleApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		
		Doctor doc1 = ctx.getBean(Doctor.class);
		System.out.println(doc1);
		
		Doctor doc2 = ctx.getBean("ent",Doctor.class);
		System.out.println(doc2);
		
		Doctor doc3 = (Doctor)ctx.getBean("ent");
		System.out.println(doc3);
		
		ctx.close();
				

	}

}
