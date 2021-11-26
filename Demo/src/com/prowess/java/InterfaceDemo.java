package com.prowess.java;

interface Gshape{
	void garea();
}

class gcircle implements Gshape{
	public void garea() {
		System.out.println("Area of a circle is equal to 'pi*r^2'");		
	}
}

class gsquare implements Gshape{
	public void garea() {
		System.out.println("Area of a square is equal to 'l*b'");		
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Gshape cir = new gcircle();
		Gshape squ = new gsquare();
		cir.garea();
		squ.garea();
	}
}
