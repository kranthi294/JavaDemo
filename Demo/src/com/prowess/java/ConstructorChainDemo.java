package com.prowess.java;

public class ConstructorChainDemo {
	int InstanceVariable;

	public static void main(String[] args) {
		ConstructorChainDemo nonParamConst = new ConstructorChainDemo();
		ConstructorChainDemo singleParamConst = new ConstructorChainDemo(5);
		ConstructorChainDemo doubleParamConst = new ConstructorChainDemo(5,10);
		System.out.println("Instance variable value of Non-Parameterized/Default constructor(Constructor Chaining): "+nonParamConst.InstanceVariable);
		System.out.println("Instance variable value of Single Parameterized constructor(Constructor Chaining): "+singleParamConst.InstanceVariable);
		System.out.println("Instance variable value of Double Parameterized constructor: "+doubleParamConst.InstanceVariable);
	}
 
	//Non-Parameterized/Default constructor
	ConstructorChainDemo() {
		//Constructor chaining by calling second constructor in case
		//of no value passed during instance creation with default value.
		this(25);
	}
	
	//Parameterized constructor with single param
	ConstructorChainDemo(int val) {
		//Constructor chaining by calling third constructor from this constructor using 'this' keyword.
		this(val,0);
	}

	//Parameterized constructor with two param
	ConstructorChainDemo(int val1, int val2) {
		//Constructor Overloading: Same constructor(Class) name with different parameters.
		InstanceVariable = val1 + val2;
	}
	
}
