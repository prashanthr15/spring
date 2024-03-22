package com.prog.beans;

public class Alpha {

	//cyclic dependency injection
	private Beta beta;
	
	public Alpha() {
		
		System.out.println("alpha bean created");
	}
	
//	public void Alpha(Beta beta) {
//		this.beta = beta;
//		System.out.println(" alpha bean is createdclass");
//
//	}

//	public void setBeta(Beta beta) {
//		this.beta = beta;
//		System.out.println("setBeta() invoked and injected beta into alpha class");
//
//	}
	
	
}
