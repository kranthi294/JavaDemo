package com.prowess.java;

class vehicle{
	String wheels = "Vehicle moves on wheels, it can have morethan 1 wheel and upto any number of wheels.";
}

class truck extends vehicle{
	String wheels = "Truck is a sub-class of vehicle. It can have 4 wheels or more.";
	void printwheel() {
		System.out.println("Wheels string from super class: " + super.wheels);
		System.out.println("Wheels string from sub class  : " + wheels);
	}
}

public class SuperKeywordDemo {
	public static void main(String[] args) {
		truck tk = new truck();
		tk.printwheel();
	}
}
