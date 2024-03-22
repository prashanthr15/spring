package com.prog;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//it is @componentscan also @configuraftion in combination @SpringBootApplication
@SpringBootApplication
public class DemoApplication {

	static {
		System.out.println("demo is loading ........");
	}
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("sprig container used here : " + context.getClass().getName());
		System.out.println("beans getting created behind the scene : " + context.getBeanDefinitionCount());
		System.out.println("beans names which are getting created : " + Arrays.toString(context.getBeanDefinitionNames()));
	}

}
