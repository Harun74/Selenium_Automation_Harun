package com.usa.constructor;

public class Constructor {
	
	Constructor(String name){
		
		System.out.println(name);
		
	}
   
	Constructor(int salary){
		
		System.out.println(salary);
		
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Harun");
		Constructor obj1 = new Constructor(500);
		
	}
}
