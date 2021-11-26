package com.prowess.java;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello world";
		System.out.println("String s1: '"+ s1 +"' and its length is: "+s1.length());
		System.out.println(s1.toUpperCase());
		String s3 = s1.substring(6);
		System.out.println(s3);
		System.out.println("Whether String ("+ s1 +") is containing char 'h': "+s1.contains("h"));
		System.out.println("Whether String ("+ s1 +") is equal to ("+ s2 +"): "+s1.equals(s2));
		//String buffer section --- Synchronous and thread safe.
		//Recommended for multi-threaded application as it is thread safe. 
		StringBuffer s4 = new StringBuffer("Prowess Software");
		System.out.println("StringBuffer before append: "+s4);
		s4.append(" Services Pvt Ltd.!");
		System.out.println("StringBuffer after append: "+s4);
		s4.replace(30, 33, "Limited");	//Starting index inclusive, Ending index non-inclusive.
		System.out.println("StringBuffer after replace: "+s4);
		System.out.println("StringBuffer Reversal: "+s4.reverse());	//Since StringBuffer is mutable, this action will reverse the source
		System.out.println("StringBuffer Length(Present Occupancy): "+s4.length());
		System.out.println("StringBuffer Capacity(Total memory allocation): "+s4.capacity());
		//String builder section --- Asynchronous and not thread safe but faster as it is Async.
		//Recommended for single threaded application as it is not thread safe.
		//Functionality is same as StringBuffer class as this is a wrapper class itself.
		StringBuilder sb = new StringBuilder("Prowess Software Services Pvt Ltd.!");
		System.out.println("StringBuilder: "+sb);
	}
}
