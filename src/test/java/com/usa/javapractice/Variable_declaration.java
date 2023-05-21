package com.usa.javapractice;

public class Variable_declaration {
	
	//How to declare a variable
	
	String name = "Fahim";// Instance variable
 static	String course = "Automation";//static variable
 
 
 
 public  void getSalary() {	
	
	 int salary = 1500;//Local variable
	    System.out.println(name); 
		System.out.println(course);
		System.out.println(salary); 
	 
	 }
 
 public static void main(String[] args) {
	 
	 Variable_declaration obj = new Variable_declaration(); 
	     obj.getSalary();
		
		
	  
	
	 
	 
 }
	
	
	
	
		
	

}
