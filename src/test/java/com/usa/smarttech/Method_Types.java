package com.usa.smarttech;

public class Method_Types {

	
	
	//This is a void method
	public void getEmployee() {
		
	System.out.println("Harun");
	
	
		
	}

	//This is a return method
	public static int getSalary() {
		return 6000;
		
		
	}
	
	public  String getName() {
		
		String vehicle = "Car";
		return null;
		
		
	
		
		
		
	}
	
	//This is parameterized method
	public static void getEmployeeInfo(int salary, int bonus) {
		
		salary = 10000;
		bonus = 3000;
		System.out.println(salary+bonus);
		
		
	}
	
	public static void main(String[] args) {
		
		Method_Types obj = new Method_Types();
		obj.getEmployee();
		
		Method_Types.getSalary();
		System.out.println(Method_Types.getSalary());
	
		Method_Types.getEmployeeInfo(10000, 3000);
		
		String name = "Fahim";
		System.out.println(name);
		
		
		int salary = 1500;
		System.out.println(salary);
		
		String vehicle = "Car";
		System.out.println(vehicle);
	}
	
	
	
	
}
