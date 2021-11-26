package com.prowess.java;

public class ConstructorDemo {
	int InstanceVariable;

	public static void main(String[] args) {
		ConstructorDemo nparamConst = new ConstructorDemo();
		ConstructorDemo paramConst = new ConstructorDemo(5);
		//Lets create a new instance of our current class. To validate its output, comment out all constructors below.
		ConstructorDemo defaultConst = new ConstructorDemo();
		System.out.println("Instance variable value of non-parameterized constructor: "+nparamConst.InstanceVariable);
		System.out.println("Instance variable value of Parameterized constructor: "+paramConst.InstanceVariable);
		System.out.println("Instance variable value of default constructor: "+defaultConst.InstanceVariable);

	}
	//Default/ Non-Parameterized Constructor 
	ConstructorDemo() {
		InstanceVariable = 100;
	}

	//Parameterized Constructor
	ConstructorDemo(int val) {
		InstanceVariable = val;
	}
	
}
