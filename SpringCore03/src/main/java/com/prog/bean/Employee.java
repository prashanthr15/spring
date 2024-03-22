package com.prog.bean;

public class Employee {

	
	private Integer id;
	private String empName;
	private String empCity;
	private Float empSalary;
	
	
	
	static {
		System.out.println("employee class loaded....");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}

//	public Employee() {
//		System.out.println("default constructer in employee bean created");
//	}

	public Employee(Integer id, String empName, String empCity, Float empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
		
		System.out.println("param emp constructer invoked");
	}
	
	public String empActivity() {
		
		System.out.println("employee usally sleep at officce hout after lunch");
		
		return "if manager is around emp will try to act active";
	}
	
}
