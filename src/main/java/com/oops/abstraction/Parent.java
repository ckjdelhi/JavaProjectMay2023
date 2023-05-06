package com.oops.abstraction;

//75% abstraction
public abstract class Parent {

	//abstract method
	abstract void show();
	abstract void display();
	abstract void insert();
	
	//concrete method
	void delete() {
		System.out.println("delete");
	}
}
