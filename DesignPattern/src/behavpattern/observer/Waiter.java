package behavpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		String msg = null;
		if(o instanceof MealOrder){
			msg = (String) arg;
		}
		
		if(msg.equals("Accepted")){
			System.out.println("Hooray order accepted");
		}
		
		else if(msg.equals("Completed")){
			System.out.println("Contratulation your order is ready");
		}
	}

}
