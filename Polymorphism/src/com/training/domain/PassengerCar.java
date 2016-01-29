package com.training.domain;

import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "swift";
	}

}
