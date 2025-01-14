package com.prog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.bo.Customer;
import com.prog.dao.ICustomerRepo;
import com.prog.dto.CustomerDTO;

@Service
public class CustomerServiceImp implements ICustomerService {
	
	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(CustomerDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("implementing of mongo repo : "+repo.getClass().getName());
		Customer cusDocument= new Customer();
		BeanUtils.copyProperties(dto, cusDocument);
		
		Customer c = repo.save(cusDocument);
		return "Data stored as Document in mongo DB "+ c.getCusNo();
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String removeDocument(String id) {
		// TODO Auto-generated method stub
		
		Optional<Customer> doc = repo.findById(id);
		if(doc.isPresent()) {
			//repo.delete(doc.get());
			repo.deleteById(id);
			return "document deleted....";
		}
		return "unable to delkete document";
	}

}
