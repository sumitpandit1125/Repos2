package com.training.domains;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pat")
public class Patient {
	
	@Value("Sumit")
	private String patientName;
	
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Patient(String patientName) {
		super();
		this.patientName = patientName;
	}

	

	public String getPatientName() {
		return patientName;
	}



	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}



	@Override
	public String toString() {
		return "Patient [name=" + patientName + "]";
	}
	
	

}
