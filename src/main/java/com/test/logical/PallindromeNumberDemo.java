package com.test.logical;

public class PallindromeNumberDemo {

	public static void main(String[] args) {
		int num = 123;//321
		int rev = 0;//5x10+6=56
		int t = num;
		while(num > 0) {
			int temp= num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		if(t == rev) {
			System.out.println(t+" is a pallindrome number");
		}else {
			System.out.println(t+" is not a pallindrome number");
		}

	}

}
