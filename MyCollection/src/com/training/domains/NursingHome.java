package com.training.domains;

import java.util.*;

import com.training.utils.MyComparators;


public class NursingHome {
	
	private ArrayList<Doctor> docList;

	public NursingHome() {
		
		docList = new ArrayList<Doctor>();
		
	}
	
	
	public boolean addDoctor(Doctor doc){
		boolean result = false;
		
		result = docList.add(doc);
		
		return result;
	}
	
	public void printDoctor(){
		for (Doctor doc : docList){
			System.out.println(doc);
			if(doc.getPat()!=null){
				for(Patient pat:doc.getPat()){
					System.out.println(pat);
				}
			}
			else
				System.out.println("No Appointments");
			
		}
	}
	
	public void printSortedDoctor(){
		
		Collections.sort(docList);
		printDoctor();
	}
	
	public void printSortedDoctor(int key){
		MyComparators comp = new MyComparators();
		switch (key) {
		case 1 :
			printSortedDoctor();
			break;
		case 2 :
			MyComparators.NameComparator comp1 = comp.new NameComparator();
			Collections.sort(docList,comp1);
			printDoctor();
			break;
		case 3 :
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(docList,comp2);
			printDoctor();
			break;
		default :
			break;
			
		}
	}

}
