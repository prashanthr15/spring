package com.prog.beans;

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
 */
	private CourierService service;
	
	
	public Amazon() {
		System.out.println("amazon obj is created");
	}


	public Amazon(CourierService service) {
		super();
		this.service = service;
	}


	public void setService(CourierService service) {
		this.service = service;
		System.out.println("setter is invoked to perform injection");
	}
	
	public boolean inititeDelivary(double amount) {
		
		return service.courierService(amount);
	}
}
