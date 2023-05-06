package com.oops.inheritance;

//Parent: super class / base class /parent class.
//Child: sub class / derived class / extended class / child class

public class InheritanceDemo extends Parent{

	public static void main(String[] args) {
		InheritanceDemo obj=new InheritanceDemo();
		obj.show();
		obj.display();
		obj.insert();
		obj.delete();
	}
	
	void insert() {
		System.out.println("insert");
	}

}
