package com.prog.model;

public class Implementers {

	private Integer id;
	private String iname;
	private String icity="india";
	private Double isalary;
	
	public Implementers() {
		System.out.println("zero param constructer in iplementers cls");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIcity() {
		return icity;
	}

	public void setIcity(String icity) {
		this.icity = icity;
	}

	public Double getIsalary() {
		return isalary;
	}

	public void setIsalary(Double isalary) {
		this.isalary = isalary;
	}

	@Override
	public String toString() {
		return "Implementers [id=" + id + ", iname=" + iname + ", icity=" + icity + ", isalary=" + isalary + "]";
	}
	
	
	
}
