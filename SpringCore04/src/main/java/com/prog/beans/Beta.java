package com.prog.beans;

public class Beta {
	//cyclic dependency injection
	private Alpha alpha;
	
	
	public Beta() {

		System.out.println("Beta bean created");
	}
	
//	public void Beta(Alpha alpha) {
//		this.beta = beta;
//		System.out.println(" beta bean is createdclass");
//
//	}
//	
//	public void setAlpha(Alpha alpha) {
//		this.alpha = alpha;
//		
//		System.out.println("setalpha() invoked and injected alphs into beta class");
//	}
}
