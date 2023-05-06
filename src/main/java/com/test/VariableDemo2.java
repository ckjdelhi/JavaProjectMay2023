package com.test;

public class VariableDemo2 {

	int a = 5; //instance variable
	static int b = 5; //static variable or shared 
	
	public static void main(String[] args) {

		
		VariableDemo2 s1=new VariableDemo2();
		s1.a = 20000;
		VariableDemo2.b = 10;
		
		VariableDemo2 s2=new VariableDemo2();
		s2.a = 30;
		VariableDemo2.b = 15;
		
		
		System.out.println("S1: a="+s1.a+ " b="+VariableDemo2.b);// 20, 20
		System.out.println("S2: a="+s2.a+ " b="+VariableDemo2.b);// 30, 30
		
	}

}
