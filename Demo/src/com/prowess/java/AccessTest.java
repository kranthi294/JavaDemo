package com.prowess.java;

public class AccessTest {
	public static void main(String[] args) {
		MainDemo sobj = new MainDemo();
		// Uncomment below line to check the accessibility error of private access modifier.
		//sobj.PrivateAccessTest();
		sobj.publicAccessTest();
	}

}
