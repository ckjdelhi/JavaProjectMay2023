package com.oops;

/*
 * Method Overloading Rules:
 * 1. Method name should be same
 * 2. No. of Arguments  or type should be different
 * 3. Method return type doesn't matter
 */
public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int result = c.add(20, 30);
		System.out.println("Addtion = "+result);
		
		c.sub(30, 10);//20
		
		OverloadingDemo obj=new OverloadingDemo();
		obj.add();
		obj.add(10);
		obj.add(10L);
		obj.add(10, 20);
		
		System.out.println();
		System.out.println("hi");
		System.out.println(10);
		System.out.println(10L);
		
	}
	void add() {
		System.out.println("add");
	}
	int add(int a, int b, int c) {
		System.out.println("add");
		return 0;
	}
	void add(int a) {
		System.out.println("add "+a);
	}
	void add(long b) {
		System.out.println("add "+b);
	}
	void add(int a, int b) {
		System.out.println("add "+a +" "+ b);
	}
}
