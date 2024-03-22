package com.prog.dto;

import org.springframework.data.annotation.Id;




public class CustomerDTO {
//dto means dATA TRANSFER OBJECT

	@Id
	private String id;
	
	private Integer cusNo;
	
	private String name;
	
	private String city;
	
	private Float billAmount;
	
	public CustomerDTO() {
		System.out.println("zero para constructor in customerDTO cls");
	}


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


	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", cusNo=" + cusNo + ", name=" + name + ", city=" + city + ", billAmount="
				+ billAmount + "]";
	}


	public CustomerDTO(String id, Integer cusNo, String name, String city, Float billAmount) {
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
