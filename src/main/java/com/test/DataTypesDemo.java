package com.test;

/*
 * 0 or 1 = 1 bit
 * 8 bits = 1 bytes
 * 1024 bytes = 1 Kilo Byte (KB)
 * 1024 KB = 1 Mega bytes(MB)
 * 1024 MB = 1 Giga bytes(GB)
 * 1024 GB = 1 Tera Bytes(TB)
 * 1024 TB = 1 Penta Bytes(PB)
 */
/**
 * Java Data Types:
 * 1. Primitive data types(fixed size) - 8 
 * 	Boolean - boolean(true/false) - 1 bit
 * 	Numeric
 * 		Character - char('A', '1') - 2 bytes
 * 		Integral
 * 			Integer(10, 400, 200)
 * 				byte - 1 byte
 * 				short -2 bytes
 * 				int   -4 bytes
 * 				long  -8 bytes
 * 			Floating-point(40.30)
 * 				float - 4 bytes
 * 				double - 8 bytes
 * 2. Non primitive data types(variable size)- String, Array, Object
 *
 */
public class DataTypesDemo {
	boolean b = 10>20;//1 bit
	char c = 'B'; //2
	char c1= 64; //2 ASCII code
	
	byte b1=127;//1
	short s=10;//2
	int i = 10;//4
	long l= 10L; // 8 bytes=> 64 bits
	
	float f=40.50f;//4
	double d = 40.50d;//8
	
	public static void main(String[] args) {
		DataTypesDemo obj1=new DataTypesDemo();//31.1 bytes
		DataTypesDemo obj2=new DataTypesDemo();//31.1 bytes
		DataTypesDemo obj3=new DataTypesDemo();//31.1 bytes
		
	
		byte a = 127;
		byte b = 6;
		System.out.println(a + b);
		
	}

}
