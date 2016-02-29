package strupattern.facade;

public class Client {
	
	public static void main(String[] args) {
		ServiceFacade facade = new ServiceFacade();
		System.out.println(facade.getHotelAvailability() + "\n");
		System.out.println(facade.getFlightAvailability() + "\n");
		
	}

}
