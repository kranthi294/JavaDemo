package com.prowess.java;

interface greet{
	//--- With Java 8, we have default, Private & Static methods comes into picture. Earlier we used to have only Abstract methods and
	//--- Static final variables(Constants).
	
	//--- Default method in an interface. 
	default void greetmsg() {
		System.out.println("\nHello, this is the default method implementation of an interface.");
		System.out.println("Following is the public/default implementation of a private method.");
		hello();
	}
	
	//--- Abstract method in an interface	
	void say(String mesg);
	
	//--- Private method in an interface	
	private void hello() {
		System.out.println("\nHi, I am a private method in this interface. I cannot be accessed by other classes outside of this interface.");
	}
	
	//--- Static method in an interface	
	static void display() {
		System.out.println("Hi, I am a static method in this interface. I can be accessed without the instantiation.");
		System.out.println("Check the code in main block to see I was invoked even before the object instantiation....\n");
	}
}

public class InterfacePriDefDemo implements greet{
	//--- Implementation of abstract method from the interface
	public void say(String mesg) {
		System.out.println(mesg);
	}
	public static void main(String[] args) {
		greet.display();
		InterfacePriDefDemo idemo = new InterfacePriDefDemo();
		idemo.say("Welcome to Prowess Software Services Pvt Ltd..!");
		idemo.greetmsg();
	}
}
