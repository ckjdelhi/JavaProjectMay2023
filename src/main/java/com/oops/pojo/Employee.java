package com.oops.pojo;
/*
 * POJO/(Getter/Setter)/Model class: Plain old java object 
 * 1. all variables should be private  
 * 2. Add default constructor 
 * 3. Add parameterized constructor
 * 4. Add getter and setter methods
 * 5. Add toString() method
 */
public class Employee {
	private String firstName;
	private int empId;
	private double salary;
	private String country;
	private int zipCode;
	
	public Employee() {
	}
	public Employee(String firstName, int empId, double salary, String country, int zipCode) {
		this.firstName = firstName;
		this.empId = empId;
		this.salary = salary;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", empId=" + empId + ", salary=" + salary + ", country=" + country
				+ ", zipCode=" + zipCode + "]";
	}
	
}


