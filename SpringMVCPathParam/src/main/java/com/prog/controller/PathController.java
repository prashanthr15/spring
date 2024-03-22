package com.prog.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathController {

	//localhost:8080/getmessage/rajesh/springboot
	
	//to read this use @PathVariable("name")
	@GetMapping("/getmessage/{name}/{course}")
	public String displayMessage(@PathVariable("name") String name,@PathVariable("course") String c,Map<String, Object>model) {
		
		String msg = "hello" +name + "i hpe u r enjy course" +c;
		model.put("msg", msg);
		return "index";
	}
}
