package com.clinicallab.entity;

import java.sql.Date;
import java.util.Set;

public class TestRequest {
	
	private Integer requestCode;
	private Integer patientCode;
	private Integer doctorCode;
	private Date requestDate;
	private Set<Test> testList;

}
