package com.prog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hom2")
public class FirstController {

	@GetMapping("/hom")
	public String someMessage(Model model) {
		System.out.println("control in controller");
		System.out.println("implementation by " +model.getClass().getName());
		
		model.addAttribute("name","navib");
		return "home";//logical view name lvn
	}
	
	
//	@RequestMapping("/hom2")
//	public String someMessage2(Model model) {
//		System.out.println("implementation by " +model.getClass().getName());
//		
//		model.addAttribute("name","vabbavib");
//		return "home";//logical view name lvn
//	}
}
