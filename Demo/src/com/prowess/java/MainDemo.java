package com.prowess.java;

public class MainDemo {
	Integer instanceVariable = 0;
	public static void main(String[] args) {
		System.out.println("!------- Main Test Class -------!");
		staticTest();
//		System.out.println("Integer variable(i) value = %i", &i);
//		i = 12;
//		System.out.println("Integer variable(i) value = " + i);
		MainDemo sobj = new MainDemo();
		sobj.nStaticTest();
		sobj.instanceVariable = 20;	//Can access instance variable only through object reference since class is static and variable is non-static.
		Calculator calc = new Calculator();
		System.out.println(calc.add(34.7,30.6));
		System.out.println(calc.add(34.7,30.6, 25.1));
//		System.out.println(calc.sub(34.7,30.6));
//		System.out.println(calc.mul(34.7,30.6));
//		System.out.println(calc.div(34.7,30.6));
	}
	public void nStaticTest() {
		System.out.println("Non-Static Method/Class Output..!");
		instanceVariable = 10;	//Can access instance variable directly since both variable and class are non-static.
	}
	
	public static void staticTest() {
		System.out.println("Static Method/Class Output......!");
	}

	@SuppressWarnings("unused")	
	private void privateAccessTest() {
		System.out.println("Private method from demo1 class......!");		
	}
	
	public void publicAccessTest() {	//Both Public & Default are accessible from sub-classes
		System.out.println("Public/Default method from demo1 class......!");		
	}

}
