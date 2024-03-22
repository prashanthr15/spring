package com.prog.SpringJdbcApi.Dao;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer id;
	private String city;
	private String name;
	private Integer age;
	
	public Employee() {
		System.out.println("employee bean");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", city=" + city + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
	
}
