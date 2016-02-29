package behavpattern.strategy;

public class Client {

	public static void main(String[] args) {
		BillPayment pmt = new BillPayment();
		pmt.setPmt(new CashPayment());
		System.out.println(pmt.makePayment(5000, "cash payment "));

	}

}
