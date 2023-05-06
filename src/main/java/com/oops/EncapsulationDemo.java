package com.oops;

/*
 * Access Modifiers:
 * 1. public: can accessible anywhere in whole project: 
 * 			a.within same class
 * 			b.within same package other class
 * 			c.outside package in other class
 * 2. private: can be accessible within same class only
 * 3. protected:can be accessible 
 * 			a. within same class
 * 			b. within same package other class
 * 			c. outside of package in other class using inheritance
 * 4. default: can be accessible 
 * 			a. within same class
 * 			b. within same package other class
 */


public class EncapsulationDemo {
	
	public int pubA=5;
	private int priB=6;
	protected int proC=7;
		     int defD=8;
	

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.pubA);
		System.out.println(obj.priB);
		System.out.println(obj.proC);
		System.out.println(obj.defD);
	}

}