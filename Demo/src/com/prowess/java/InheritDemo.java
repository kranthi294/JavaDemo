package com.prowess.java;

class Manager{
	long Salary;
}

public class InheritDemo extends Manager{
	public static void main(String[] args) {
		Manager emp1 = new Manager();
		emp1.Salary = 10000;
		System.out.println("Salary of emp created from Manager(Parent/Super) class: "+emp1.Salary);
		InheritDemo emp2 = new InheritDemo();
		emp2.Salary = 20000;
		System.out.println("Salary of emp created from InheritDemo (Child/Sub) class: "+emp2.Salary);
	}

}
