package com.prog.beans;

import org.springframework.stereotype.Component;

@Component("hibernate")
public class Hibernate implements Course {

	public Hibernate() {
		System.out.println("hibernate bean created");
	}
	@Override
	public boolean selectCourse(double amount) {
		// TODO Auto-generated method stub
		System.out.println("hibernate course is selected and the fees paid is : " + amount);
		return true;
	}

}
