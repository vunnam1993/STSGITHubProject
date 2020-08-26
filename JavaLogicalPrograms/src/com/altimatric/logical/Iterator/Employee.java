package com.altimatric.logical.Iterator;

public class Employee {
	private String name;
	private float salary;
	private String designation;
	public Employee(String name, float salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	

}
