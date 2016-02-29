package strupattern.proxy;

public class Client {

	public static void main(String[] args) {
		CalculateBeanProxy proxy = new CalculateBeanProxy();
		proxy.method();

	}

}
