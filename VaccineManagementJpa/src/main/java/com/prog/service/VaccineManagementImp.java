package com.prog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.prog.bo.VaccineDetails;
import com.prog.dao.IVaccineRepo;

@Service
public class VaccineManagementImp implements IVaccineManagement{

	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineDetails> searchVaccineByGivenData(VaccineDetails vaccine, 
			boolean status, String... args) {
		
		Example<VaccineDetails> example = Example.of(vaccine);
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, args);
		return repo.findAll(example, sort);
		
	
		
	}
}
