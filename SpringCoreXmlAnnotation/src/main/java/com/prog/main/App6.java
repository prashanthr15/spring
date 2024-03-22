package com.prog.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prog.beans.Amazon;

public class App6 {

	public static void main(String[] args) {
		
		//ApplicationContext container is eager loading
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Amazon amazon=context.getBean("amazon",Amazon.class);
		
		boolean status = amazon.inititeDelivary(399.9);
		
		if(status) {
			System.out.println("delivered successfully");
		}
		else
		{
			System.out.println("failed to deliver");
		}
	}
}
