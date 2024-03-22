package com.prog.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prog.bo.VaccineDetails;


//@Repository its optional write or not to write anything is ok
public interface IVaccineRepo extends CrudRepository<VaccineDetails, Serializable> {

}
