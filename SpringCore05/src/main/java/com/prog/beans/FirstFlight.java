package com.prog.beans;

public class FirstFlight implements CourierService{
	
	public FirstFlight() {
		System.out.println("FirstFlight obj is created");
	}

	@Override
	public boolean courierService(double amount) {
		// TODO Auto-generated method stub
		System.out.println("courier delivered through FirstFlight and amount paid is  " + amount);

		return true;
	}

}
