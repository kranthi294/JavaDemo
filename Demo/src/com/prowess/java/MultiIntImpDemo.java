package com.prowess.java;
//--- First interface to implement an abstract method walk
interface hwalking{
	void walk();
}

//--- Second interface to implement an abstract method run
interface hrunning{
	void run();
}

//--- First class to implement both the above interfaces.
//--- Implementing multiple interfaces is possible, but extending multiple classes is not possible
class animal implements hwalking,hrunning{
	@Override
	public void run() {
		System.out.println("Class animal is implementing interface run.");		
	}
	@Override
	public void walk() {
		System.out.println("Class animal is implementing interface walk.");
	}
}

//--- Second class to extend above parent class which has multi-implementation.
class human extends animal{}

public class MultiIntImpDemo {
	public static void main(String[] args) {
		// Observe that we are instantiating child(human) class to parent(animal) class.
		animal h1 = new human();
		animal h2 = new human();
		h1.walk();
		h2.run();
	}
}
