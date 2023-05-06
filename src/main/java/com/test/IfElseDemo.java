package com.test;

/*
 * 1. if
 * 2. if-else
 * 3. if-else if
 * 4. if-else if -else if
 * 5. if-else if -else
 */
public class IfElseDemo {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 1;
//		if(a > b) {
//			System.out.println("Yes");
//		}
		
//		if(a > b) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
//		if(a > b) {
//			System.out.println("Yes a > b");
//		}else if(a > c) {
//			System.out.println("Yes a > c");
//		}
		
		if(a > b) {
			System.out.println("Yes a > b");
		}else if(a > c) {
			System.out.println("Yes a > c");
		}else {
			System.out.println("No a is not greater than b and c");
		}
		
	}

}
