package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		String str="Hi, Welcome to Java Session";
		System.out.println(str.length());//27
		System.out.println(str.toUpperCase());//HI, WELCOME TO JAVA SESSION
		System.out.println(str.toLowerCase());//hi, welcome to java session
		
		//compare operator
		String s1="B";//66
		String s2="a";//65
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));//0, -ve, +ve
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(str.startsWith("Hi"));
		System.out.println(str.endsWith("Session"));
		
		System.out.println(str.contains("Java"));
		System.out.println(str.matches(".*Java.*"));
		
		String EMAIL_PATTERN = 
		        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		String email="chandan.krk@gmail.co.in";
		System.out.println(email.matches(EMAIL_PATTERN));
		
		String s="Hi, Welcome to Java Session";
		System.out.println(s.substring(s.indexOf("W")));
		System.out.println(s.substring(4, 11));
		System.out.println(s.replace(",", ""));
		System.out.println(s.indexOf("W"));//4
		System.out.println(s.charAt(4));//W
		//System.out.println(s.repeat);
		
		int a=50;
		int b=50;
		System.out.println(String.valueOf(a)+String.valueOf(b));//5050
	
		StringBuilder sb=new StringBuilder();//fast, not thread safe
		sb.append("Hi");
		sb.append("hello");
		System.out.println(sb.toString());
		
		StringBuffer sbf=new StringBuffer();//little slow, thread safe
		sbf.append("Hi");
		sbf.append("hello");
		System.out.println(sbf.toString());
		
		String str2="Hi";
		//System.out.println(str2.repeat(2));
	
	}

}
