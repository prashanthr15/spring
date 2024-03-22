package com.prog.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//majority use eager loading
//in industry we are using annotations,springboot with annotations
public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

	}		

}
