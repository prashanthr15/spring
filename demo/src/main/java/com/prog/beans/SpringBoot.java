package com.prog.beans;

import org.springframework.stereotype.Component;

@Component("springBoot")
public class SpringBoot implements Course {
	
	
	public SpringBoot() {
		System.out.println("SpringBoot bean created");
	}
	@Override
	public boolean selectCourse(double amount) {
		// TODO Auto-generated method stub
		System.out.println("SpringBoot course is selected and the fees paid is : " + amount);
		return true;
	}
}
