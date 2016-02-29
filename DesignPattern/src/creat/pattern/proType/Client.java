package creat.pattern.proType;

public class Client {

	public static void main(String[] args) {
		Employee org = new Employee(101,"Sumit");
		
		System.out.println("Original created :" +org);
		Employee protoType = null;
		try {
			protoType = (Employee)org.clone();
			
			protoType.setEmployeeName("Pandit");
			
			org = (Employee)protoType.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Original created :" +org);
		System.out.println("Original created :" +protoType);
	}

}
