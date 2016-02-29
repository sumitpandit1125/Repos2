package strupattern.proxy;

public class CalculateBeanProxy implements CalculateBean {

	@Override
	public void method() {
		CalculateBeanImpl real = new CalculateBeanImpl();
		real.method();
		
	}

}
