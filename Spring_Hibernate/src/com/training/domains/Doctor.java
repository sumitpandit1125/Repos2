package com.training.domains;

public class Doctor {
	
	private int doctorCode;
	private String doctorName;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorCode, String doctorName) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
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
	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + "]";
	}
	
}
