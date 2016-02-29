package com.training.apps;
import java.util.ArrayList;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {
		
		Greeting grt = ()->{System.out.println("Hello JAVA8");};
		grt.show();
		
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Tom");
		nameList.add("Dick");
		nameList.add("Harry");
		nameList.add("Raja");
		
		nameList.forEach(System.out::println);
		
		
	}

}
