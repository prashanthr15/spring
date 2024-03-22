package com.prog.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document

public class Customer {

	@Id
	private String id;
	
	private Integer cusNo;
	
	private String name;
	
	private String city;
	
	private Float billAmount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCusNo() {
		return cusNo;
	}

	public void setCusNo(Integer cusNo) {
		this.cusNo = cusNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public Customer() {
		System.out.println("zero para constructor in customer cls");
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusNo=" + cusNo + ", name=" + name + ", city=" + city + ", billAmount="
				+ billAmount + "]";
	}

	public Customer(String id, Integer cusNo, String name, String city, Float billAmount) {
		super();
		this.id = id;
		this.cusNo = cusNo;
		this.name = name;
		this.city = city;
		this.billAmount = billAmount;
	}

	public Float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
	
	
}
