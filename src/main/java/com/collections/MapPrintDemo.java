package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrintDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> mapObj=new HashMap<>();
		mapObj.put("name", "Ram");
		mapObj.put("age", "20");
		mapObj.put("course", "Java");
		System.out.println(mapObj);
		System.out.println(mapObj.size());//3
		System.out.println(mapObj.get("age"));//20
		System.out.println(mapObj.keySet());//[name, course, age]
		System.out.println(mapObj.values());//[Ram, Java, 20]
		System.out.println(mapObj.entrySet());//[name=Ram, course=Java, age=20]
		
		//way-1
		Set<String> allKeys = mapObj.keySet();
		Iterator<String> itr=allKeys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key +"\t"+ mapObj.get(key));
		}
		
		for(String key: allKeys) {
			System.out.println(key +"\t"+ mapObj.get(key));
		}
		
		//way-2
		allKeys.forEach(key -> System.out.println(key +"\t"+ mapObj.get(key)));
		
		//way-3
		Set<Entry<String, String>> entryObj=mapObj.entrySet();
		for(Entry<String, String> entry:entryObj) {
			System.out.println(entry.getKey() +"\t"+ entry.getValue());
		}
		
		//way-4
		entryObj.forEach(p ->System.out.println(p.getKey()+"\t"+p.getValue()));

	}

}
