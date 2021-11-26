package com.prowess.java;

abstract class shape{
	shape(){	//Default constructor which gets executed on instance creation.
		System.out.println("Shape is a base class and this the default consructor implementation on instantiation..");}
	abstract void area();
	void side() { System.out.println("A shape can have any number of sides ranging from 0(circle) to infinite...."); }
}
class circle extends shape{
	void area() {
		System.out.println("It is a circle implementation which has area formula as Pir^2");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		shape cr = new circle();
		cr.area();
		cr.side();
	}
}
