package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Error: can't be handled
 * Exception: can be handled
 * 	1. Checked/Compile time : must be handled by developer 
 * 	2. Unchecked/Runtime
 */
public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		//Checked Exception
		FileInputStream fs=new FileInputStream(new File("abc.txt"));
		
		
		//UnChecked/runtime Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		String str="hello";
		int index=0;
		try {
			index = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(index>=str.length()) {
			System.out.println("Invalid input");
		}else {
			System.out.println(str.charAt(index));
		}
	}
}
