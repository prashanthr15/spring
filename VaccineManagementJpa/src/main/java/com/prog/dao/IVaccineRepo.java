package com.prog.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> {

}
