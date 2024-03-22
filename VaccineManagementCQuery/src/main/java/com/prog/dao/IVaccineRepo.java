package com.prog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prog.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>{

	@Query("from VaccineDetails where vaccineCompany=:company")
	public List<VaccineDetails>searchVaccineByCompanyName(String company);
	
	
	@Query("from VaccineDetails where vaccineName=:vname")
	public List<VaccineDetails>searchVaccineByVaccineName(String vname);
	
	
	
	
}
