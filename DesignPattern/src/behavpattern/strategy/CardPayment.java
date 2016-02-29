package behavpattern.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amount, String description) {
		
		String  msg = "Your payment of INR " + amount + " By Card " + description + "is succesful.";
		StringBuffer buffer = new StringBuffer(msg);
		double processFee = amount * 0.012;
		buffer.append("Processing fee of rs. " +processFee+" is chargeable");
		double totalFee = amount + processFee;
		buffer.append("Total fee is rs. " +totalFee);
		return buffer.toString();
		
	}

}
