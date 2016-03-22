package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;
import com.training.domains.HiberSpringExample;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Doctor doc = new Doctor(110, "Mahes");
		HiberSpringExample hsp = ctx.getBean(HiberSpringExample.class);
		System.out.println(hsp.add(doc));
		
		
	}

}
