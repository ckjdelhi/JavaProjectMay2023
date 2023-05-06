package com.oops.pojo;

/*
 * POJO: Plain Old Java Object
 *
 */
//in.co.abc.oops
//in.co.abc.pojo
//in.co.abc.string

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e4 = new Employee("Ravi", 103, 10000, "UK", 10000);
		
		
		Employee e1= new Employee();
		e1.setEmpId(100);
		e1.setFirstName("Chandan");
		e1.setCountry("India");
		e1.setSalary(5000);
		e1.setZipCode(11000);
		
		
		Employee e2= new Employee();
		e2.setEmpId(101);
		e2.setFirstName("Raj");
		e2.setCountry("US");
		e2.setSalary(6000);
		e2.setZipCode(10000);
		
		Employee e3= new Employee();//ALT + SHIFT + R to rename
		e3.setEmpId(102);
		e3.setFirstName("Mohit");
		e3.setCountry("Bhutan");
		e3.setSalary(12000);
		e3.setZipCode(12000);
		
		Employee e5 = new Employee("Ravi", 103, 10000, "UK", 10000);
		
		
		Employee empArr[]=new Employee[5];
		empArr[0]= e1;
		empArr[1]= e2;
		empArr[2]= e3;
		empArr[3]= e4;
		empArr[4]= e5;
		
		System.out.println("EmpID\tFirstName\tSalary");
		for(Employee obj:empArr) {
			System.out.println(obj.getEmpId() +"\t"+ obj.getFirstName() +"\t"+ obj.getSalary());
		}
		
		
	}

}
