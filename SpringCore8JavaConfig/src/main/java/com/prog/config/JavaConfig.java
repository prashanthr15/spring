package com.prog.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.prog"})
public class JavaConfig {

	public JavaConfig() {
		System.out.println("java configuaration instantiated");
	}
	
	@Bean
	public LocalDateTime createBean() {
		System.out.println("local date time obj by dev");
		
		return LocalDateTime.now();
	}
}
