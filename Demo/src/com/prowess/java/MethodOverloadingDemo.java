package com.prowess.java;
//Method Overloading is nothing but static polymorphism.It is called compile time polymorphism
//since during compilation the linking between different types of methods based on no. of params passed.
public class MethodOverloadingDemo {
	public void area(double l, double b) {
		double sar = l*b;
		System.out.println("Area of the Square/Rectangle is: "+ sar);
	}
	
	public void area(double r) {
		double car = 3.14*r*r;
		System.out.println("Area of the Circle is: "+ car);
	}
	
	public void disp(String s) {
		System.out.println("Displaying from String  method: " + s);
	}
	
	public void disp(int i) {
		System.out.println("Displaying from integer method: " + i);
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo oldemo = new MethodOverloadingDemo();
		//--------- Method Overloading with same data types but with diff params
		oldemo.area(5);
		oldemo.area(4.5, 5.7);
		//--------- Method Overloading with diff data types and diff params
		System.out.println();
		oldemo.disp(5);
		oldemo.disp("Hello from Method Overloading demo...!");
	}
}
