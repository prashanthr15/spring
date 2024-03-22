package com.prog.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccineInfo")
public class VaccineDetails {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="VACCINENAME")
	private String vaccinename;
	
	@Column(name="VACCINECOMPANY")
	private String vaccinecompany;
	
	@Column(name="PRICE")
	private Integer price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVaccinename() {
		return vaccinename;
	}

	public void setVaccinename(String vaccinename) {
		this.vaccinename = vaccinename;
	}

	public String getVaccinecompany() {
		return vaccinecompany;
	}

	public void setVaccinecompany(String vaccinecompany) {
		this.vaccinecompany = vaccinecompany;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VaccineDetails [id=" + id + ", vaccinename=" + vaccinename + ", vaccinecompany=" + vaccinecompany
				+ ", price=" + price + "]";
	}
	
	public VaccineDetails() {
		System.out.println("zero param in constructor in vaccinedetails cls");
	}

	public VaccineDetails(String vaccinename, String vaccinecompany, Integer price) {
		super();
		
		this.vaccinename = vaccinename;
		this.vaccinecompany = vaccinecompany;
		this.price = price;
	}

	
	
	
	
}
