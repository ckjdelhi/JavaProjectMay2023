package com.test.logical;

public class SwapNumbersDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		System.out.println("before swap: a="+a+" b="+b);
//		int temp = a;
//		a = b;
//		b = temp;
		
		//swap numbers without using 3rd variables
		
		a = a + b; //5+6=11
		b = a - b; //11-6=5
		a = a - b; //11-5=6
		
		System.out.println("before swap: a="+a+" b="+b);
		
		
	}

}
