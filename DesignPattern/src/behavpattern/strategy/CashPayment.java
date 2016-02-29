package behavpattern.strategy;

public class CashPayment implements PaymentStrategy {

	
	
	@Override
	public String pay(double amount, String description) {
		
		String  msg = "Your payment of INR " + amount + " By Cash " + description + "is succesful.";
		StringBuffer buffer = new StringBuffer(msg);


		buffer.append("Total fee is rs. " +amount);
		return buffer.toString();
	}

}
