package com.prog.dao;

import org.springframework.data.repository.CrudRepository;

import com.prog.model.CustomerInfo;

public interface ICustomerDao extends CrudRepository<CustomerInfo, Integer> {

}
