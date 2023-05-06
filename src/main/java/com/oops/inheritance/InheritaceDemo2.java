package com.oops.inheritance;

import com.array.Array1DDemo;

class GradParent {
	void show() {
		System.out.println("gp show");
	}
}
class Parent1 extends GradParent { //IS-A relation
	void display() {
		
	}
}
class Child extends Parent1 {
	void insert() {
		
	}
	void show() {
		System.out.println("child show");
	}
}

public class InheritaceDemo2 {

	public static void main(String[] args) {
		Array1DDemo obj= new Array1DDemo(); //HAS-A relationship
		obj.arrayPrint();
		
		GradParent gp=new GradParent();
		gp.show();
		
		Parent1 p=new Parent1();
		p.display();
		p.show();
		
		Child c=new Child();
		c.display();
		c.show();
		c.insert();
	}

}
