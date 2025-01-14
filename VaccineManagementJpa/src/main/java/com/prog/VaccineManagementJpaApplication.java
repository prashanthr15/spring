package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prog.bo.VaccineDetails;
import com.prog.service.VaccineManagementImp;

@SpringBootApplication
public class VaccineManagementJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(VaccineManagementJpaApplication.class, args);
		
		VaccineManagementImp service = context.getBean(VaccineManagementImp.class);
		VaccineDetails vaccine=new VaccineDetails("sputnik", "rusiia", 4543);
		service.searchVaccineByGivenData(vaccine, true, "vaccinename", "vaccinecompany").
		forEach(v->System.out.println(v.getVaccinename() + " : "+ v.getVaccinecompany()));
		
		
		
		context.close();
		
	}

}
