package com.usa.polymorphism;

public class MethodOverloading {

	

	public void getName(String name) {
		
		System.out.println(name);

	}

	public void getName(String name, int salary) {

		System.out.println(name+salary);
	}

	public void getName(int bonus) {

		System.out.println(bonus);
	}

	public void getName(double dollar) {

		System.out.println(dollar);
	}
	
	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		obj.getName("Harun");
	  //obj.getName(Harun, 50000);
		obj.getName(500);
		obj.getName(1000);
	}
}
