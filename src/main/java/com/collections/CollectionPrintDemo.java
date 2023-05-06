package com.collections;

import java.util.*;

public class CollectionPrintDemo {

	public static void main(String[] args) {
		Vector<String> list = new Vector<>();
		list.add("B");
		list.add("A");
		list.add("A");
		list.add("123");
		list.add("123");
		//System.out.println(list.size());
		//System.out.println(list.get(3));
		
		//while, do-while, for, for-each, java8 forEach, iterator(while), listIterator(while), enumerator
		System.out.println("....using while loop.......");
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("....using for loop.......");
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j));
		}
		System.out.println("....using for-each loop.......");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("....using java 8 forEach loop.......");
		list.forEach(a->System.out.println(a));
		
		System.out.println("....using iterator loop.......");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("....using list iterator loop.......");
		ListIterator<String> listItr=list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		System.out.println("....using Enumerator loop.......");
		Enumeration<String> enu = list.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
	}

}
