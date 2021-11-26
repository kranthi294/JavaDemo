package com.prowess.java;
//---------------- Demo for Aggregation -------------------
//------------------------------------------------------
class Name{
	String first, last;
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
}
//------------------------------------------------------
class empinfo{
	int id;
	Name name;
	empinfo(int id, Name name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println("Output from EMPINFO class");
		System.out.println("Id of the employee: "+ id);
		System.out.println("Name of the employee: "+ name.first + " " + name.last);
	}
}
//------------------------------------------------------
public class HasDemo {
	public static void main(String[] args) {
		Name nm = new Name("Kranthi", "Buddha");
		empinfo ei = new empinfo(1, nm);
		ei.display();
		System.out.println("\nOutput from ei instance");
		System.out.println("Id of the employee: "+ ei.id);
		System.out.println("Name of the employee: "+ ei.name.first + " " + ei.name.last);
	}
}
