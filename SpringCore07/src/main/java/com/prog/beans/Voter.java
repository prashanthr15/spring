package com.prog.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value="voter")
@PropertySource(value = { "com/prog/commons/application.properties" })
public class Voter {

	
	@Value("${voter.info.age}")
	private int age;
	@Value("${voter.info.name}")
	private String name;
	
	static {
		System.out.println("voter class loading ..");
	}
	
	public Voter() {
		System.out.println("voter is intantiated");
	}
	
	//@PostConstruct the method you want to use after the bean is created
	@PostConstruct
	public void myInit() {
		
		System.out.println("init");
	}
	
	public String checkEligibility() {
		
		System.out.println("method call with bussiness logic");
		if(age>=18) {
			return "yhello" +name+"oure eligible for voting";
		}
		else {
		return "yhello" +name+"youre not eligible to vote";
		
		}
	}
	
	//@PreDestroy when you want to use a methos befor the bean destory last to execute
	@PreDestroy
	public void destory() {
		System.out.println("bean destroyed..");
	}
	
}
