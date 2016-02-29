package strupattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Flight implements Services {

	private HashMap<String,Integer> list = new HashMap<String,Integer>();
	
	
	
	
	public Flight() {
		super();
		list.put("JetAirways", 50);
		list.put("JetKonnect", 20);
		list.put("SpiceJet", 58);
	}




	@Override
	public String getAvailability() {
		StringBuffer buffer = new StringBuffer("Flight Availability\n");
		for(Map.Entry<String, Integer>  entry : list.entrySet()){
			 buffer.append(entry.getKey() + " : Seats Available : " + entry.getValue()+"\n");
		}
		return buffer.toString();
	}

}
