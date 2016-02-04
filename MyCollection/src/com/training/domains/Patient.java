package com.training.domains;

public class Patient implements Comparable<Patient> {
	
	private int patientId;
	private String patientName;
	private long phoneNum;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, long phoneNum) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phoneNum = phoneNum;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public int compareTo(Patient o) {
		if(patientId<o.patientId) return -1;
		if(patientId>o.patientId) return 1;
		return 0;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", phoneNum=" + phoneNum + "]";
	}
	
	
	

}
