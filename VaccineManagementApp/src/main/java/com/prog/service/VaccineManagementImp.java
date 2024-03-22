package com.prog.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.bo.VaccineDetails;
import com.prog.dao.IVaccineRepo;


@Service
public class VaccineManagementImp implements IVaccineManagement {

	//spring will give obj
	//spring will give implementation cls for interface Ivaccinerepo
	@Autowired
	private IVaccineRepo repo;
	
	//for one record insertion use save
//	@Override
//	public String registerVaccineDetails(VaccineDetails vaccine) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("implementing class of ivaccinerepo is : "+repo.getClass().getName());
//		
//		
//		VaccineDetails v=repo.save(vaccine);
//		return "vaccine details registered with id : " + v.getId();
//	}


	//for multipple record insertion use saveAll
	@Override
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccinelist) {
		// TODO Auto-generated method stub
		return repo.saveAll(vaccinelist);
	}

}
