package com.xyz;

import com.abc.Test;

public class ABC extends Test {

	public static void main(String[] args) {
		Test t= new Test();
		//System.out.println(t.a);
		//System.out.println(t.b);//private
		//System.out.println(t.c);
		System.out.println(t.d);
		
		
		ABC obj=new ABC();
		//System.out.println(obj.a);//default: same package
		//System.out.println(obj.b);//private: same class
		System.out.println(obj.c);//protected
		System.out.println(obj.d);//public
	}

}
