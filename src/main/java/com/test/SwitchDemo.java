package com.test;

public class SwitchDemo {

	public static void main(String[] args) {
				
		int a = 4;
		switch(a) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				//break;
			case 5:
				System.out.println("5");
				//break;
			default:
				System.out.println("Not matched");
				break;
		}
	}

}
