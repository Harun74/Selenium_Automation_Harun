package com.usa.encapsulation;

public class EncapsulationA {

	private String jobTitle = "QA Automation engineer";

	private int salary = 50000;
	
    //We used getter() method
	
	private String getJobTitle() {

		return jobTitle;
	}

	//We used getter() method
	private int getSalary() {

		return salary;
	}

	public static void main(String[] args) {

		EncapsulationA obj = new EncapsulationA();

		obj.getJobTitle();
		obj.getSalary();
		System.out.println(obj.getJobTitle());
		System.out.println(obj.getSalary());

	}
}
