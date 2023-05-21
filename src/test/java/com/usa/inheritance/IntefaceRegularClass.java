package com.usa.inheritance;

public class IntefaceRegularClass implements InterfaceA, InterfaceB {

	public void getPropertiesB() {

		System.out.println("I am from Interface B");

	}

	public void getPropertiesA() {

		System.out.println("I am from Interface A");

	}

	public static void main(String[] args) {

		IntefaceRegularClass obj = new IntefaceRegularClass();

		obj.getPropertiesA();
		obj.getPropertiesB();

	}

	

}
