package com.oops;

class A {
	void show() {
		System.out.println("A show");
	}
}
class B extends A {
	void display() {
		System.out.println("B display");
	}
	void show() {
		System.out.println("B show");
	}
}

public class DynamicObjectDemo {

	public static void main(String[] args) {
		A obj = new B();
		obj.show();
		//obj.display();

	}

}
