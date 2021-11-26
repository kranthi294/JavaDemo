package com.prowess.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class FileIODemo {
	public static void main(String[] args) throws FileNotFoundException {
		File Empinfo = new File("C:\\Users\\KranthiBuddha\\eclipse-workspace\\empinfo.txt");
		FileIODemo iodemo = new FileIODemo();
		iodemo.WriteToFile(Empinfo);
		iodemo.ReadFile(Empinfo);
	}
	
	public void WriteToFile(File FileToWrite) {
		PrintWriter EmpInfoWriter = null;
		try {
			EmpInfoWriter = new PrintWriter(FileToWrite);
			EmpInfoWriter.println("Prowess Software Services");
			EmpInfoWriter.println("Kranthi Buddha - E128");
			System.out.println("File writing is compleated in the location: " + FileToWrite);
		}catch(FileNotFoundException e) {
			System.out.println("Given file is not found/has no write access to the location: " + FileToWrite);
			throw new RuntimeException(e);
		} finally {
			EmpInfoWriter.close();
		}	
	}
	
	public void ReadFile(File FileToRead) throws FileNotFoundException {
		Scanner infile = new Scanner(FileToRead);
		while(infile.hasNextLine()) {
			System.out.println("Lines from file: " + infile.nextLine());
		}
		infile.close();
	}
}
