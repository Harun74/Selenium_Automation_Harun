package com.usa.inheritance;

public class A extends B {
	
	public void getName() {
		System.out.println("My name is A");
		
	}
	
	public static void main(String[] args) {
		A obj = new A();
		obj.getName();
		obj.getSalary();
		obj.getBonus();
	}

}
