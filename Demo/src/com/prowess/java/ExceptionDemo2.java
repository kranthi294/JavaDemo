package com.prowess.java;

public class ExceptionDemo2 {
	//--- Throws is a keyword to be added in method signature to signify that the exception occurred during the method execution
	//--- needs to be handled by the calling processes as it is not being handled here(called process).
	public int divide(int a, int b) throws Exception{
		int c = 0;
		c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		try {
			ExceptionDemo2 ed = new ExceptionDemo2();
			int nom = 23;
			int denom = 0;
			//--- Comment out below block of code to handle the exception in the catch block
			//--- Uncomment to throw the exception to the user-defined custom exception class created.
			/*if(denom==0) {
				throw new CustomException("Exception will occur as denominator is zero...!");
			}*/
			int answer = ed.divide(nom, denom);
			System.out.println("Division answer: "+answer);
		}catch(Exception e) {
			System.out.println("Exception during division: "+ e);
		}
	}
}
