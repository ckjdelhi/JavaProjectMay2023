package com.exception;

public class CustomExcoptionTest {

	public static void main(String[] args) throws AgeInvalidException {
		int age=17;
		if(age<18) {
			throw new AgeInvalidException("You are not allowed....");
		}else {
			System.out.println("Allowed");
		}

	}

}
