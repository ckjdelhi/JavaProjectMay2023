package com.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1="welcome";//string literal
		String s2=new String("welcome");//string object
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1 == s2);//false
		
		//== : checks the reference
		//equals : checks the content
		
		String s3="welcome";
		String s4="welcome";
		System.out.println(s3 == s4);//true
		
		String s5=new String("welcome");
		String s6=new String("welcome");
		System.out.println(s5 == s6);//false
		System.out.println(s5.equals(s6));//true
		
	}

}
