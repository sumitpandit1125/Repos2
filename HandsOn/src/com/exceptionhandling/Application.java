package com.exceptionhandling;

public class Application {
	
	public static void main(String[] args) {
		String name = null;
		String skill = null;
		double salary = 0;
			
		try{
			name = "Ramesh";
			skill = "skilled";
			salary = 9000;
			if((skill.equals("unskilled")&&salary<8500)||(skill.equals("skilled")&&salary<10500)||(skill.equals("semiskilled")&&salary<9500)){
				throw new UserException();
			}
			else{
				Employee emp = new Employee(name, skill, salary);
				System.out.println("Object Created");
				emp.showData();
			}
		}
		catch(UserException excp){
			System.out.println(excp.getMessage());
		}			
		
	}

}
