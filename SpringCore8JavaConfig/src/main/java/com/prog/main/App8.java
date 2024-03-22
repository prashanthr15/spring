package com.prog.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prog.beans.GreetMe;
import com.prog.config.JavaConfig;

public class App8 {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		GreetMe greet=context.getBean(GreetMe.class);
		System.out.println(greet.generateGreeting("ram"));
	} 
}
