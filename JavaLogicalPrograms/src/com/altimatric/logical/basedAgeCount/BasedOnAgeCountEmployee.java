package com.altimatric.logical.basedAgeCount;

public class BasedOnAgeCountEmployee {
	
	private String name;
	private int age;
	private float salary;
	
	public BasedOnAgeCountEmployee() {
		super();
		
	}
	public BasedOnAgeCountEmployee(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "BasedOnAgeCountEmployee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
