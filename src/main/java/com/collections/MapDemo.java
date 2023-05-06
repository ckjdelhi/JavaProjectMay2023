package com.collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		/*
		 * 1. key should be unique
		 * 2. Unordered
		 */
		Map<String, String> map=new HashMap<>();
		map.put("name", "Ram");
		map.put("age", "20");
		map.put("course", "Java");
		System.out.println(map);
		
		/*
		 * 1. key should be unique
		 * 2. insertion order
		 */
		Map<String, String> map1=new LinkedHashMap<>();
		map1.put("name", "Ram");
		map1.put("age", "20");
		map1.put("course", "Java");
		System.out.println(map1);
		
		/*
		 * 1. key should be unique
		 * 2. sorted (natural order)
		 */
		Map<String, String> map11=new TreeMap<>();
		map11.put("name", "Ram");
		map11.put("age", "20");
		map11.put("course", "Java");
		System.out.println(map11);
		
		/*
		 * 1. key should be unique
		 * 2. Unordered
		 * 3. thread safe
		 */
		Map<String, String> map111=new Hashtable<>();
		map111.put("name", "Ram");
		map111.put("age", "20");
		map111.put("course", "Java");
		System.out.println(map111);
		
	}

}
