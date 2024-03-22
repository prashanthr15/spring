package com.prog.SpringJdbcApi;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prog.SpringJdbcApi.Dao.Employee;
import com.prog.SpringJdbcApi.Dao.EmployeeDaoImpl;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBoot01Application.class, args);
		
		EmployeeDaoImpl emp= context.getBean(EmployeeDaoImpl.class);
		//1 method
//		List<Employee> list = emp.getTheEmployee();
//		Iterator<Employee> itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//2 method
//		List<Employee> list = emp.getTheEmployee();
//		list.forEach(em->System.out.println(em));
		
		//3 method
		emp.getTheEmployee().forEach(emp1->System.out.println(emp1));
		
		context.close();
	}

}
