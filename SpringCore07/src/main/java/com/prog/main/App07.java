package com.prog.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prog.beans.Voter;

public class App07 {

	public static void main(String[] args) {
		
		
		System.out.println("container started");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//we going with the id so cast it to Voter
	//	Voter voter=(Voter) context.getBean("voter");
		
		//no casting is needed because we are going with voter class
		Voter voter=context.getBean(Voter.class);
		System.out.println(voter.checkEligibility());
		context.close();
		System.out.println("container stopped" );
	}
}
