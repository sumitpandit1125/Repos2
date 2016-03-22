package com.training.entity;

import java.util.Set;

public class Doctor {
	
	private int doctorCode;
	private String doctorName;
	private long handPhone;
	private Address resident;
	private Address clinic;
	private Assistant assistant;
	private Set<Patient> patientList;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	public Set<Patient> getPatientList() {
		return patientList;
	}





	public void setPatientList(Set<Patient> patientList) {
		this.patientList = patientList;
	}





	public Doctor(int doctorCode, String doctorName, long handPhone, Address resident, Address clinic,
			Assistant assistant, Set<Patient> patientList) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.resident = resident;
		this.clinic = clinic;
		this.assistant = assistant;
		this.patientList = patientList;
	}





	public Assistant getAssistant() {
		return assistant;
	}


	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}


	public int getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public Address getResident() {
		return resident;
	}

	public void setResident(Address resident) {
		this.resident = resident;
	}

	public Address getClinic() {
		return clinic;
	}

	public void setClinic(Address clinic) {
		this.clinic = clinic;
	}


	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", resident=" + resident + ", clinic=" + clinic + ", assistant=" + assistant + "]";
	}

	
	
	
	

}
