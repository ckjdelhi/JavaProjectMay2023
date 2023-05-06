package com.test;
//Array, String, OOPS

public class LoopDemo {

	public static void main(String[] args) {
		//for(cha a: test){} - array
		
		//While, do-while, for
		
		//declare variable
		//while(terminate condition) {
		//..
		//..
		//increment/decrement operator
		//}
		
//		int number = 10;
//		while(number>=1) {
//			System.out.println(number);
//			number--;
//		}
//		
//		
//		int num = 100;
//		do {
//			System.out.println(num);
//			num--;
//		}while(num>=1);
		
		
//		for(int n = 1;n<=10;n++) {
//			if(n >= 5) {
//				//break;
//				continue;
//			}
//			System.out.println(n);	
//		}
		for(int i=1; i<=100;i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
