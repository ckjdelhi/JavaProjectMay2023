package com.exception;

public class ExeptionHandlingDemo {

	public static void main(String[] args) {
		try {
			//code
			System.out.println(10/0);
			String s=null;
			System.out.println(s.length());//NullPointerException
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("NullPointer: "+ex.getMessage());
		}catch(IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
