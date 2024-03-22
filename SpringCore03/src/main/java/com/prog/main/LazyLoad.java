package com.prog.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.prog.bean.Employee;

/*application context
 * ===================
 * application context=> when it loads the bean is created => eager loading
 * we specifyin configation in xml file regarding th e objects
 * in one container it can hold only one applicationcontext.xml files
 * 
 * bean factory
 * =============
 * it is deprecated in spring 3.1
 * bean factory will not create the object until we call it =>lazy loaded
 * Employee emp1=factory.getBean("emp1", Employee.class);
 * 
 * DefaultListableBeanFactory
 * ===========================
 * in one container it can hold multiple applicationcontext.xml files
 * lazy loading
 */
public class LazyLoad {

	
	public static void main(String[] args) {
		//Resource resource= new ClassPathResource("applicationcontext.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read= new XmlBeanDefinitionReader(factory);
		
		read.loadBeanDefinitions("applicationcontext.xml");
		
		Employee e = factory.getBean("emp", Employee.class);

		System.out.println(e);
		System.out.println("==========================================");

		Employee e1 = factory.getBean("emp1", Employee.class);

		System.out.println(e1);
		System.out.println("==========================================");
	}
}




















