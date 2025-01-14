package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prog.dto.CustomerDTO;
import com.prog.generator.IdGenerator;
import com.prog.service.CustomerServiceImp;

@SpringBootApplication
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMongoDbApplication.class, args);
	CustomerServiceImp service = context.getBean(CustomerServiceImp.class);
	//data insertion or save or update
	//String status = service.registerCustomer(new CustomerDTO(101,"ramesh","chennai"));
	//System.out.println(status);
	
//	CustomerDTO dto = new CustomerDTO();
//	dto.setId(IdGenerator.generateId());
//	dto.setCusNo(11);
//	dto.setName("ram");
//	dto.setCity("eu");
//	dto.setBillAmount(334.5f);
//	
//	String status = service.registerCustomer(dto);
//	System.out.println(status);
	
	
	//searching
	service.findAllCustomers().forEach(c->System.out.println(c));
	
	
	//deleting
//	String status = service.removeDocument("65f8683e25b49c334ccf0ba7");
	//System.out.println(status);
	context.close();
	}

}
