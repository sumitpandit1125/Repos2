package com.training.myException;

//Inheritance
//Checked Exception - Because Extending Exception

public class RangeCheckException extends Exception {
	
	private long handPhone;
	
	//Mandatory Dependency
	public RangeCheckException(long handPhone) {
		super();
		this.handPhone = handPhone;
	}
	
	// Overriding Super Class Method
	@Override
	public String getMessage() {

		return handPhone + "Should be 10 digit number";
	}
	
	

}
