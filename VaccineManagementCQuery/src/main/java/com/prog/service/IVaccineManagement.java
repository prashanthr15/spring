package com.prog.service;

import java.util.List;

import com.prog.bo.VaccineDetails;

public interface IVaccineManagement {

	public List<VaccineDetails> fetchVaccineByCompanyName(String company);
	
	public List<VaccineDetails> fetchVaccineByVaccineName(String vname);

}
