package com.prog.service;

import java.util.Iterator;

import com.prog.bo.VaccineDetails;

public interface IVaccineManagement {

	//public String registerVaccineDetails(VaccineDetails vaccine);
	
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccine);

}
