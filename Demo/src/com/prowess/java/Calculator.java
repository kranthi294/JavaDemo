package com.prowess.java;

public class Calculator {
	public Double add(Double arg1, Double arg2) {
		System.out.println("Normal add method -:)");
		Double aresult = arg1 + arg2;
		return aresult;
	}
	
	public Double add(Double arg1, Double arg2, Double arg3) {
		System.out.println("Overloaded add method -:(");
		Double aresult = arg1 + arg2 + arg3;
		return aresult;
	}
	
	public Double sub(Double arg1, Double arg2) {
		Double sresult = arg1 - arg2;
		return sresult;
	}
	
	public Double mul(Double arg1, Double arg2) {
		Double mresult = arg1*arg2;
		return mresult;
	}
	
	public Double div(Double arg1, Double arg2) {
		Double dresult = arg1/arg2;
		return dresult;
	}
}
