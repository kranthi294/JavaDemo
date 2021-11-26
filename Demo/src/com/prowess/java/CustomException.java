package com.prowess.java;

public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;
	CustomException(String s){super(s);	}
	CustomException(Exception e){super(e);}
}
