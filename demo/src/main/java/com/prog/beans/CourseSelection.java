package com.prog.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("course")
public class CourseSelection {

	//Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
	//now 3 cls are implementing course interface so there will be a ambiquity exception 
	//field injection
	@Autowired
	@Qualifier("java")
	private Course course;
	
	public CourseSelection() {
		System.out.println("CourseSelection bean is created");
	}
	public boolean chooseCourse(double amount) {
		
		//from java.hibernate,springboot selectcourse methosd will return a boolean value so choosecourse will also return same value to who invoked 
		return course.selectCourse(amount);
	}
}
