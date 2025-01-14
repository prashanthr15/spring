package com.prog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstWebController {

	@RequestMapping("/welcome")
	public ModelAndView displayMessage() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message","welcome to learning");
		
		mav.setViewName("index");//LVN logocal view name
		
		return mav;
							
	}
	
	
	@RequestMapping("/home")
	public ModelAndView displayMessage2() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message","spring mvc welcome to learning");
		
		mav.setViewName("index");//LVN logocal view name
		
		return mav;
							
	}
}
