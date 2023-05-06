package com.oops;
/*
 * 1. Method name should be same
 * 2. No. of Arguments  and type should be same
 * 3. Return type should be same
 */
class Parent {
	void show(int a) {
		System.out.println("P show");
	}
	void display() {
		System.out.println("P display");
	}
}
class Child extends Parent {
	void insert() {
		System.out.println("C insert");
	}
	//OVERRIDING
	void show(int a) {
		System.out.println("Child show");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Child c=new Child();
		c.insert();
		c.show(10);
		c.display();
		
		System.out.println("---------Parent object----------");
		Parent p=new Parent();
		p.show(10);
		p.display();
		
		System.out.println("----------Dynamic object---");
		Parent obj = new Child();
		//obj.insert();
		obj.display();
		obj.show(10);
	 
		
		
		
	}

}
