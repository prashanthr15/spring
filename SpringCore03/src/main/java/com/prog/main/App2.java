package com.prog.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prog.bean.Employee;

public class App2 {
	
	/*
	 * if spring create a object called bean
	 * if we create a object called object
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// talk to spring
		// ApplicationContext parent for ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		// if we have multiple beans specifyb its ref nae in xml id="emp"
		// Employee e=context.getBean(Employee.class);
		// getting the beans from spring to call custom methods
		Employee e = context.getBean("emp", Employee.class);

		System.out.println(e);
		System.out.println("==========================================");

		Employee e1 = context.getBean("emp1", Employee.class);

		System.out.println(e1);
		System.out.println("==========================================");

		Employee e2 = context.getBean("emp2", Employee.class);

		System.out.println(e2);
		System.out.println("==========================================");

		Employee e3 = context.getBean("emp3", Employee.class);

		System.out.println(e3);
		System.out.println("==========================================");

	}

}
