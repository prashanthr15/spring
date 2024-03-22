package com.prog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.bo.VaccineDetails;
import com.prog.dao.IVaccineRepo;

@Service
public class VaccineManagementImp implements IVaccineManagement{

	@Autowired
	private IVaccineRepo repo;
	@Override
	public List<VaccineDetails> fetchVaccineByCompanyName(String company) {
		// TODO Auto-generated method stub
		return repo.searchVaccineByCompanyName(company);
	}
	@Override
	public List<VaccineDetails> fetchVaccineByVaccineName(String vname) {
		// TODO Auto-generated method stub
		return repo.searchVaccineByVaccineName(vname);
	}

}
