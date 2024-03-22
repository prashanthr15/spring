package com.prog.service;

import java.util.List;

import com.prog.bo.VaccineDetails;

public interface IVaccineManagement {

	 public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine,
	    		boolean status, String... args);
	
}
