package com.prog.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Amazon {
/*
 * Amazon
 * ========
 * is the target cls for spring ioc
 * which are the dependemt obj here
 * fedex,bluedart,firstflight
 * 
 * auto wireing
 * =============
 * linking of two objects is called auto wireing
 * 
 * => when ever we have the dependent cls and target cls which ever we create object first
    first dependent object later target object
    
    target of qualifier is field,methos ,local var
 */
	
	//auto wire at field level
	@Autowired
	@Qualifier("fedex")
	private CourierService service;
	
	
	public Amazon() {
		System.out.println("amazon obj is created");
	}


	@Autowired
	
	public Amazon(@Qualifier("ff") CourierService service) {
		super();
		this.service = service;
	}

	//auto wire at method level
		@Autowired
		@Qualifier("bd")
	public void setService(CourierService service) {
		this.service = service;
		System.out.println("setter is invoked to perform injection");
	}
	
	public boolean inititeDelivary(double amount) {
		
		return service.courierService(amount);
	}
}
