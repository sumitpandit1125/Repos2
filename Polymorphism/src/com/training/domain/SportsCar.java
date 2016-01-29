package com.training.domain;

import com.training.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 2000000;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pajero Sports";
	}

}
