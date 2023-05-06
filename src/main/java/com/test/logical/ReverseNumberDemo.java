package com.test.logical;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		int num = 12321;//123
		int rev = 0;//5x10+6=56
		
		while(num > 0) {
			int temp= num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reverse="+rev);

	}

}
