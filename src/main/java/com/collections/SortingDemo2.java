package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Chandan", "India"));
		list.add(new Employee(100, "Amar", "US"));
		list.add(new Employee(99, "Mohan", "UK"));
		list.add(new Employee(102, "Shohan", "Bhutan"));
		
		System.out.println("Before Sort:");
		System.out.println("EmpID\tEmpName\tCountry");
		list.forEach(e->System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getCountry()));
		
		Collections.sort(list);
		System.out.println("\nAfter sorting by name ASC");
		list.forEach(e->System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getCountry()));
		
		
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getCountry().compareTo(o2.getCountry());
			}
		});
		
		System.out.println("\nAfter sorting by country ASC");
		list.forEach(e->System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getCountry()));
		
		
	}

}
