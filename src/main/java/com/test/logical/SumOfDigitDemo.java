package com.test.logical;

public class SumOfDigitDemo {

	public static void main(String[] args) {
		int num = 123465; //1+2+3+4+6+5 =>21
		int sum = 0;
		
		while(num > 0) {
			int temp= num % 10;
			sum = sum + temp;
			num = num / 10;
		}
		System.out.println("Sum of Digits="+sum);
	}

}
