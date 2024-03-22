package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prog.beans.CourseSelection;

public class Application {

	static {
		System.out.println("demo is loading ........");
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		CourseSelection cs = context.getBean(CourseSelection.class);
		boolean status = cs.chooseCourse(234.5);
		
		
		if(status) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
		
		context.close();
		
	}
	
}
