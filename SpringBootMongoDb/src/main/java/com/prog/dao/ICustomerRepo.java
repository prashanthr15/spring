package com.prog.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prog.bo.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
