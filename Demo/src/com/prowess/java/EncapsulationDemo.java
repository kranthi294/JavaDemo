package com.prowess.java;
//--- Encapsulated class where we expose the getter and setter methods as public.
//--- We restrict the access to its contents like variables with private access modifier.
class Employee1{
	private String name = "Kranthi";
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		System.out.println("Printing private variable default value from emp class using getter method: " + emp.getName());
		emp.setName("Prowess");
		System.out.println("Printing private variable after updated value using setter method from emp class : " + emp.getName());
	}
}
