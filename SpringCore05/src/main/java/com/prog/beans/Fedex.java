package com.prog.beans;

public class Fedex implements CourierService{
	
	
	public Fedex() {
		System.out.println("Fedex obj is created");
	}

	@Override
	public boolean courierService(double amount) {
		// TODO Auto-generated method stub
		System.out.println("courier delivered through fedex and amount paid is  " + amount);
		return true;
	}

}
