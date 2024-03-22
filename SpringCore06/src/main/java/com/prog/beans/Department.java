package com.prog.beans;

public class Department {

	private Integer depno;
	
	private String depName;
	
	public Department(Integer depNo, String depName) {
		
		super();
		this.depno=depNo;
		this.depName=depName;
		System.out.println("depart obj is created");
	}

	@Override
	public String toString() {
		return "Department [depno=" + depno + ", depName=" + depName + "]";
	}
	
	
}
