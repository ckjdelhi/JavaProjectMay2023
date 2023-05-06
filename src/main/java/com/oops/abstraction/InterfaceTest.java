package com.oops.abstraction;
/*
 * 1. by default all methods in interface are  abstract type
 * 2. to access interface, we need to 'implements' 
 * 3. we can't create object of interface
 */
interface ITest {
	void show();//public abstract void show();
	void display();//public abstract void display();
}

interface ITest2 {
	void insert();
}

interface ITest3 extends ITest2, ITest {
	
}

public class InterfaceTest implements ITest, ITest2, ITest3 {

	public static void main(String[] args) {
		ITest t=new InterfaceTest();
		t.show();
		t.display();
		//t.insert();
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

}
