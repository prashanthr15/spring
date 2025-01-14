package com.prog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prog.bo.VaccineDetails;
import com.prog.service.VaccineManagementImp;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(VaccineManagementAppApplication.class, args);
		
		VaccineManagementImp service= context.getBean(VaccineManagementImp.class);
		
		
//		VaccineDetails vaccine= new VaccineDetails("covaccin","bharatbio",45433);
//		String message = service.registerVaccineDetails(vaccine);
		
		List<VaccineDetails> vaccinelist= new ArrayList<>();
		vaccinelist.add(new  VaccineDetails("covidshield","astrazenica",45543));
		vaccinelist.add(new  VaccineDetails("phizer","moderna",4553));
		vaccinelist.add(new  VaccineDetails("sputnik","rusiia",4543));
		
		service.registerMultipleVaccineDetails(vaccinelist);

		System.out.println("check your db");
		
		context.close();
		
	}

}
