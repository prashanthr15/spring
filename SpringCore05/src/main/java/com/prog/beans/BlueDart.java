package com.prog.beans;

public class BlueDart implements CourierService{

	
	
	public BlueDart() {
		System.out.println("BlueDart obj is created");
	}
	
	
	@Override
	public boolean courierService(double amount) {
		// TODO Auto-generated method stub
		System.out.println("courier delivered through bluedart and amount paid is  " + amount);
		return true;
	}

}
