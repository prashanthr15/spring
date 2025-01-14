package com.prog.service;

import java.util.List;

import com.prog.bo.Customer;
import com.prog.dto.CustomerDTO;

public interface ICustomerService {

	public String registerCustomer(CustomerDTO dto) ;
		
	public List<Customer> findAllCustomers();
	
	public String removeDocument(String id);
	
}
