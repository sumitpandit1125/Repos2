package strupattern.composite;

public class Client {

	public static void main(String[] args) {
		
		Store s1 = new Store(5000, "A");
		Store s2 = new Store(25000, "B");
		Store s3 = new Store(15000, "C");
		
		City delhi =new City("Delhi");
		
		delhi.addLeaf(s1);
		delhi.addLeaf(s2);
		delhi.addLeaf(s3);
		
		
		Store s4 = new Store(5000, "A");
		Store s5 = new Store(25000, "B");
		Store s6 = new Store(15000, "C");
		
		City gurgaon =new City("Gurgaon");
		
		gurgaon.addLeaf(s4);
		gurgaon.addLeaf(s5);
		gurgaon.addLeaf(s6);
		
		
		
		State nCR = new State("NCR");
		
		nCR.addLeaf(delhi);
		nCR.addLeaf(gurgaon);
		
		System.out.println("Total Collection " + nCR.getProfit());
		
	}

}
