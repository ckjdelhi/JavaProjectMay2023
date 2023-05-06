package com.oops.abstraction;
/*
 * Abstract class rules:
 * 1. add 'abstract' modifier before class name
 * 2. Can't create object of 'abstract' class (instantiation)
 * 3. to access, always extends the abstract class
 * 4. in abstract class, we can have 'abstract method' and 'non abstract method'(concrete method)
 * 5. to create abstract method, use 'abstract' keyword to method name
 * 6. abstract method must be in abstract class
 * 7. abstract method doesn't have body
 * 8. must override abstract method in child class
 */
abstract class AbstractClass {
	//non abstract method (concrete method)
	void show() {
		System.out.println("show");
	}
	
	abstract void display();
}

public class AbstractTest extends AbstractClass{

	public static void main(String[] args) {
		//AbstractClass obj= new AbstractClass();
		AbstractTest obj=new AbstractTest();
		obj.show();
		obj.display();
	}

	
	void display() {
		System.out.println("display");
	}

}
