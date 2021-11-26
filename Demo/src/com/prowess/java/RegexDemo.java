package com.prowess.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String SourceString = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod\r\n"
				+ "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At\r\n"
				+ "vero eos et accusam et justo duo dolores et ea rebum. \r\n"
				+ "\r\n"
				+ "Stet clita kasd gubergren,\r\n"
				+ "no sea takimata sanctus est Lorem ipsum dolor sit amet.\r\n"
				+ "\r\n"
				+ "Ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod\r\n"
				+ "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At\r\n"
				+ "vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren,\r\n"
				+ "no sea takimata sanctus est Lorem ipsum dolor sit amet.";
		//"Hello, Welcome to Prowess";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(SourceString);
		while(m.find()) {
			System.out.println(SourceString.substring(m.start()-1, m.end()));
		}
	}

}
