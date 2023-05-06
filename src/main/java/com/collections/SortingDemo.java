package com.collections;

import java.util.*;
public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(60);
		list.add(100);
		list.add(10);
		list.add(20);
		list.add(200);
		list.add(10);
		list.add(20);
		System.out.println("Before sort: \n"+list);
		Collections.sort(list);
		System.out.println("After sort-ASC: \n"+list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After sort-DESC: \n"+list);

		//Reverse order sort
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1; //ASC
			}
		});
		System.out.println("After sort-DESC: \n"+list);
		
		list.sort((o1,o2)-> o2-o1);
		System.out.println("After sort-DESC: \n"+list);
	}

}
