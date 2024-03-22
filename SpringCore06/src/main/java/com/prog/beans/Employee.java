package com.prog.beans;

public class Employee {

	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Department department;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
	public Employee() {
		System.out.println("employee obj is created");
	}
	
}
