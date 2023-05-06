package com.test;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic Operator(+,-, *,/,% modulas operator)
//		System.out.println(10 + 10);
//		System.out.println(10 - 10);
//		System.out.println(10 * 10);
//		System.out.println(10 / 10);
//		System.out.println(20 % 7);//4
//		int number = 702;
//		System.out.println(number % 2 == 0 ? "Even number" : "Odd Number");
		
		//System.out.println(2+3+1+"A"+(1+2+5));//6A125
		
		
		//Unary Operators (+, -, ++(pre/post increment + 1), --(pre/post decrement -1))
//		int a = 5;
//		++a;//6
//		++a;//7
//		a--;//6
//		a--;//5
//		System.out.println(a);//5
		
		//int a = 3;
		//System.out.println(a++ + a++);//3 + 4 = 7
		//System.out.println(++a + ++a);//4 + 5 = 9
		
		//int a = 2;
		//System.out.println(a + --a - a--);//2 + 1 - 1 = 2
		
//		int a = 3;//4
//		int b = a++; //3
//		
//		b++; //4
//		++a;//5
//		System.out.println(a + b);//9
		
		//System.out.println(b++ + ++a);//3 + 5 = 8
//		int x = 2;
//		int y = 3;
//		//x++;
//		System.out.println(x++);
//		System.out.println(x);
		
		//Relational Operator(>, <, >=, <=, ==, !=) and it always returns boolean value(true/false)
//		int a =5;
//		int b =6;
//		int c =3;
//		System.out.println(a > b);//false
//		System.out.println(a == b);//false
//		System.out.println(a != b);//true
//		
//		//Logical Operator(&&, ||) works with relational operator and it always returns boolean value(true/false)
//		System.out.println(a > b && a > c);
		/* &&
		false && false => false
		false && true => false
		true && false => false
		true && true => true
		*/
		
		/* ||
		false || false => false
		false || true => true
		true || false => true
		true || true => true
		*/
		
//		int marks = 41;  // 30 to 40
//		if(marks>=30 && marks<=40) {
//			System.out.println("pass");
//		}
		
		//Ternary Operator(condition?true:false): inline condition
//		int a = 5;
//		int b = 6;
//		System.out.println(a > b ? "yes "+a+" is greater than "+b : "No "+a+" is not greater than "+b);
		
//		if(a>b) {
//			System.out.println("yes "+a+" is greater than "+b);
//		}else {
//			System.out.println("No "+a+" is not greater than "+b);
//		}
//		
		
		//Bitwise operators(&, |)
//		int a = 173;
//		int b = 6;
//		System.out.println(a & b);//2
//		
//		System.out.println(a & 1);//to get even or odd number
//		System.out.println(10 | 6); //14
		System.out.println(Integer.toBinaryString(88));//1110
		
		//shift operator(<<, >>)
		int x = 4;
		System.out.println(4 << 2);//16
		System.out.println(4 >> 2);//1
		System.out.println(11 << 3);
		
	}

}
