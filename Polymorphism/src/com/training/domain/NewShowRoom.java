package com.training.domain;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {
	public Automobile getItem(int key){
		switch (key) {
		case 4:
			return new SportsBike();
		case 1:			
		case 2: 			
		case 3:
		default:
			return super.getItem(key);
		}
	}
}
