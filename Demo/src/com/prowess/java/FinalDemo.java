package com.prowess.java;
// Follow below steps to check the functionality of final keyword.
//Step-1: Run below program after removing all "final" keywords where final comments are added
//Step-2: Add final keyword to all final commented lines and observe the errors thrown by IDE.
//-------------------------------------------------------------------------------------------------------
 class parent {					// Final Class
	String parentstr = "This string is being set in parent class.";
	 void disp(){					// Final Method
		System.out.println(parentstr);
	}
}

class child extends parent{											//------- Cannot extend final class
	String childstr = "This string is being set in child class.";
	void disp() {
		System.out.println(childstr);
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		 int i = 20;				// Final Variable
		child fd = new child();
		i = 25;														//------- Cannot change final variable
		System.out.println("Printing value of variable i: " + i);
		fd.disp();
	}
}
