package com.training.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Serializable {
	
	private int stuId;
	private String stuName;
	private double academicPerformance;
	private double academicEvents;
	private double sportsActivity;
	private double culturalActivities;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName, double academicPerformance, double academicEvents, double sportsActivity,
			double culturalActivities) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.academicPerformance = academicPerformance;
		this.academicEvents = academicEvents;
		this.sportsActivity = sportsActivity;
		this.culturalActivities = culturalActivities;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getAcademicPerformance() {
		return academicPerformance;
	}
	public void setAcademicPerformance(double academicPerformance) {
		this.academicPerformance = academicPerformance;
	}
	public double getAcademicEvents() {
		return academicEvents;
	}
	public void setAcademicEvents(double academicEvents) {
		this.academicEvents = academicEvents;
	}
	public double getSportsActivity() {
		return sportsActivity;
	}
	public void setSportsActivity(double sportsActivity) {
		this.sportsActivity = sportsActivity;
	}
	public double getCulturalActivities() {
		return culturalActivities;
	}
	public void setCulturalActivities(double culturalActivities) {
		this.culturalActivities = culturalActivities;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", academicPerformance=" + academicPerformance
				+ ", academicEvents=" + academicEvents + ", sportsActivity=" + sportsActivity + ", culturalActivities="
				+ culturalActivities + "]";
	}
	
}
