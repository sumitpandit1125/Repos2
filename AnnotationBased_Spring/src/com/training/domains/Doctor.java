package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ent")
public class Doctor {

	@Value("Rajesh khanna")
	private String docName;
	
	@Value("8965231478")
	private long phoneNumber;
	
	@Autowired
	@Qualifier("inPat")
	private Patient patn;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String docName, long phoneNumber, Patient patn) {
		super();
		this.docName = docName;
		this.phoneNumber = phoneNumber;
		this.patn = patn;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Init called============");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("Destroy called=============");
	}
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Patient getPatn() {
		return patn;
	}

	public void setPatn(Patient patn) {
		this.patn = patn;
	}
	
	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", phoneNumber=" + phoneNumber + ", patn=" + patn + "]";
	}

	
	
}
