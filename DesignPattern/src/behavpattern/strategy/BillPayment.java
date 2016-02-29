package behavpattern.strategy;

public class BillPayment {
	
	private PaymentStrategy strg;

	public BillPayment() {
		super();
	}

	public void setPmt(PaymentStrategy strg) {
		this.strg = strg;
	}
	
	public String makePayment(double amount, String description){
		return strg.pay(amount, description);
	}
	
	
}
