package com.prowess.java;

interface walking{
	void walk();
}

interface running extends walking{
	void run();
}

class InterfaceExtendDemo implements running{
	public void walk() {System.out.println("Interface running extends interface walking which implements walk.");}
	public void run() {	System.out.println("Interface running implements run.");}
	public static void main(String[] args) {
		InterfaceExtendDemo intobj = new InterfaceExtendDemo();
		intobj.walk();
		intobj.run();		
	}
}
