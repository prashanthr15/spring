package com.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.prog.dao.CourseInfo;
import com.prog.dao.SpringJdbc;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

	@Autowired
	private SpringJdbc springJdbc;
	//run () automatically run affter starting the server
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//springJdbc.insert();
		springJdbc.insert(new CourseInfo(1,"java"));
		springJdbc.insert(new CourseInfo(2,"spring"));
		springJdbc.insert(new CourseInfo(3,"hibernate"));
		
		springJdbc.deleteById(2);
		System.out.println(springJdbc.findById(1));
		System.out.println(springJdbc.findById(3));

		CourseInfo ss = springJdbc.findById(1);
		System.out.println(ss);
		

		
	}

}
