package com.prog.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.model.Implementers;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ImplementorController {

	@GetMapping("/register")
	public String responseHome(@ModelAttribute("impl")Implementers impl) {
		
		
		return "register";
	}
	
	//@ModelAttribute("impl")Implementers impl to bind this java cls to form
	//"impl" this is instance of object created by spring while getting the data from form to controller
	//spring creates object for implementor cls 
	@PostMapping("/register")
	public String registerData(@ModelAttribute("impl")Implementers impl,Map<String, Object> model) {
		
		System.out.println(impl);
		model.put("impl", impl);
		return "result";
	}

//	@PostMapping("/register")
//	public String registerData(Map<String, Object> model, HttpServletRequest request) {
//		
//		Integer id = request.getParameters("id");
//		//we have to caste from string to integer
//		//for fileds do the same 
//		
//		return "register";
//	}
}
