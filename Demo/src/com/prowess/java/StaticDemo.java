package com.prowess.java;

class Employees {
	//Non-static attributes of a class. Memory allocated with every new instance/object creation.
	int id;
	int salary;
	//Static attribute of a class. Memory allocated only once during class loading in to JVM.
	static String company="Prowess";

	//Create a parameterized constructor for the class
	Employees(int i, int s){
		id = i;
		salary = s;
	}
	
	void display() {
		System.out.println("Employee id: "+ id +", Salary: "+ salary +", Company: "+ company);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		Employees e1 = new Employees(1,15000);
		Employees e2 = new Employees(2,27000);
		e1.display();
		e2.display();
		System.out.println("\nMemory management in above scenario: ");
		System.out.println("Stack: references/instances created (e1, e2)");
		System.out.println("heap : Values of id and salary of above references (e1=1,1500 & e2=2,27000)");
		System.out.println("Static: Permanent generation memory (Company=Prowess)");
	}
}
