package com.test;

import com.oops.EncapsulationDemo;

public class EncapsulationDemo3 extends EncapsulationDemo {

	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.pubA);
		//System.out.println(obj.priB);
		//System.out.println(obj.proC);
		//System.out.println(obj.defD);//default
		
		
		EncapsulationDemo3 obj2= new EncapsulationDemo3();
		System.out.println(obj2.pubA);//public
		System.out.println(obj2.proC);//protected
		//System.out.println(obj2.defD);//default
		//System.out.println(obj2.priB);//private

	}

}
