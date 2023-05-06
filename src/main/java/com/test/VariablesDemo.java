package com.test;
/*
 * Variables
 * 1. Local variable: is declared within method and can be used within same method only
 * 2. static variable: 1. is declared outside of method, at class level.
 * 					   2. static is a property of class
 * 					   3. static can be accessible in any method
 * 
 * 3. instance variable: 1. is declared outside of method, at class level
 *                       2. instance variable is property of object
 *                       3. can be accessible directly to any instance method or none static method
 *                       4. create object to access non static variable
 */
public class VariablesDemo {

	int a = 5; //instance variable
	static int b = 5; //static variable
	
	public static void main(String[] args) {
		//local variables
		int x = 100;
		String str="abc";
		float f = 50.50f;
		
		System.out.println(x);
		System.out.println(str);
		System.out.println(f);
		//System.out.println(z);
		
		VariablesDemo obj=new VariablesDemo();
		System.out.println(obj.a);//instance
		System.out.println(b);//static
		
	}
	
	static void show() {
		int z = 40; //local variable
//		System.out.println(x);
//		System.out.println(str);
//		System.out.println(f);
		
		System.out.println(z);
		VariablesDemo obj=new VariablesDemo();
		System.out.println(obj.a); //instance
		System.out.println(b);//static
		
	}
	void display() {
		System.out.println(a);//instance
		System.out.println(b);//static
	}

}
