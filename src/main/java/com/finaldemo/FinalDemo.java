package com.finaldemo;

/*
 * Access Modifiers: public, private, protected, default
 * Non-Access Modifiers: static, final, abstract, synchronized
 */

/*
 * final:
 * 1. class: you can't create child of final class or can't extends parent class
 * 2. method: you can't override parent class method
 * 3. variable: you can't change it
 */

//1. final with class name
final class Parent {
	final int age=20;
	final void show() {
		System.out.println("white");
	}
}
//class Child extends Parent{
//	void show() {
//		Parent p=new Parent();
//		p.age= 30;
//		System.out.println("Yellow" + p.age);
//	}
//}


public class FinalDemo {

	public static void main(String[] args) {
//		Child obj=new Child();
//		obj.show();
	}

}
