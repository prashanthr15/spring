package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prog.service.VaccineManagementImp;

@SpringBootApplication
public class VaccineManagementCQueryApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(VaccineManagementCQueryApplication.class, args);
		
		VaccineManagementImp service = context.getBean(VaccineManagementImp.class);
		
		service.fetchVaccineByCompanyName("rusiia").forEach(v->System.out.println(v));
		
		
		service.fetchVaccineByVaccineName("covaccin").forEach(vn->System.out.println(vn));
		
		
		context.close();
	}

}
