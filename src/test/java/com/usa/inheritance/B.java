package com.usa.inheritance;

public class B extends C{
	
	public void getSalary() {
	
		System.out.println(" My salary is : 1000");
	}

	public static void main(String[] args) {
		
		B obj = new B();
		obj.getSalary();
		obj.getBonus();
	}
}
