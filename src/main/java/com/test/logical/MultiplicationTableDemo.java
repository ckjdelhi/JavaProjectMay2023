package com.test.logical;

import java.util.Scanner;

public class MultiplicationTableDemo {

	public static void main(String[] args) {
		//Enter any number: 5
		//5 * 1 = 5
		//5 * 2 = 10
		//5 * 3 = 15
		//..
		//..
		//5 * 10= 50
		
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println(num +" * "+i +" = "+ (num * i));
		}
	}

}
