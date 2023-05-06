package com.collections;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		int arr[]=new int[5];
//		arr[0]=100;
//		arr[1]=200;
//		//arr[6]=300;
//		System.out.println(arr);
		
		List<String> list = new ArrayList<>();
		list.add("B");
		list.add("A");
		list.add("A");
		list.add("123");
		list.add("123");
		System.out.println("ArrayList:\t"+list);
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("B");
		list2.add("A");
		list2.add("A");
		list2.add("123");
		list2.add("123");
		System.out.println("LinkedList:\t"+list2);
		
		Vector<String> list3 = new Vector<>();
		list3.add("B");
		list3.add("A");
		list3.add("A");
		list3.add("123");
		list3.add("123");
		System.out.println("Vector:\t\t"+list3);
		
		
		Set<String> hasSetObj = new HashSet<>();//unordered+unique
		hasSetObj.add("B");
		hasSetObj.add("A");
		hasSetObj.add("A");
		hasSetObj.add("123");
		hasSetObj.add("123");
		System.out.println("HashSet:\t\t"+hasSetObj);
		
		Set<String> linkedHashSetObj = new LinkedHashSet<>();//insertion order+unique
		linkedHashSetObj.add("B");
		linkedHashSetObj.add("A");
		linkedHashSetObj.add("A");
		linkedHashSetObj.add("123");
		linkedHashSetObj.add("123");
		System.out.println("LinkedHashSet:\t\t"+linkedHashSetObj);
		
		Set<String> treeSetObj = new TreeSet<>();//sorted+unique
		treeSetObj.add("B");
		treeSetObj.add("A");
		treeSetObj.add("A");
		treeSetObj.add("123");
		treeSetObj.add("123");
		System.out.println("TreeSet:\t\t"+treeSetObj);
		treeSetObj.forEach(a-> System.out.println(a));
		
	}

}
