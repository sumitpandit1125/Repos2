package strupattern.facade;

public class ServiceFacade {
	
	Hotels hotel = new Hotels();
	Flight flight = new Flight();
	
	public String getHotelAvailability (){
		return hotel.getAvailability();
	}
	
	public String getFlightAvailability(){
		return flight.getAvailability();
	}
}
