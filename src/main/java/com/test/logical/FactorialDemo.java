package com.test.logical;

public class FactorialDemo {

	public static void main(String[] args) {
		int num = 6;//6x5x4x3x2x1 = 720
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial = "+fact);
	}

}
