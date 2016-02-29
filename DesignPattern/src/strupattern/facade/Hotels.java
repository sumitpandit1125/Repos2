package strupattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Hotels implements Services{
	
	private HashMap<Integer,String> list = new HashMap<Integer,String>();
	
	
	
	
	public Hotels() {
		super();
		list.put(1, "8 rooms available");
		list.put(2, "9 Rooms Available");
		list.put(3, "Only 1 room avilable");
	}




	@Override
	public String getAvailability() {
		StringBuffer buffer = new StringBuffer("Hotel Availability\n");
		for(Map.Entry<Integer, String>  entry : list.entrySet()){
			 buffer.append("Hotel No :" +entry.getKey() +" "+ entry.getValue()+"\n");
		}
		return buffer.toString();
	}

}
