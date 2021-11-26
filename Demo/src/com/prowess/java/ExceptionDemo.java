package com.prowess.java;
// We can use try-catch block of code to handle exceptions.
public class ExceptionDemo {
	public static void main(String[] args) {
		Integer i = 0;
		Integer[] arr = {1,2,3};
		try{								//--- Your logic where you expect some exception can occur.
			System.out.println(i/1);		//Change denominator to zero to generate arithmetic exception
			System.out.println(arr[3]);		//Change array index above than initialized size to generate index out of bounds exception
		//--- You can catch a specific type of exception and can have multiple catch blocks for each type of exception.
		//}catch(ArithmeticException Exception){
		//--- You can write a generic catch block to handle all types of exceptions
		}catch(Exception e) {
			System.out.println("Following exception occurred in above try block: " + e.fillInStackTrace());
		}finally{
			System.out.println("------ Program Terminated -------");
		}
	}
}
