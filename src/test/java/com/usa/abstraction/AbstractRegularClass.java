package com.usa.abstraction;

public class AbstractRegularClass extends AbstractA {

	@Override
	public void getAbstract() {
		// TODO Auto-generated method stub
		
		System.out.println("I am the abstract method");
		
	}
	
	public static void main(String[] args) {
		
		AbstractRegularClass obj = new AbstractRegularClass();	
		
		obj.getAbstract();
		obj.getName();
		obj.getSalary();
		obj.getBonus();
	}
	
	

}
