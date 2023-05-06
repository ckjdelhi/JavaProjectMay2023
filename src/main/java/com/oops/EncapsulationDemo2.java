package com.oops;

public class EncapsulationDemo2 {

	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.pubA);//public
		//System.out.println(obj.priB);//private is not accessible 
		System.out.println(obj.proC);//protected
		System.out.println(obj.defD);//default
	}

}
