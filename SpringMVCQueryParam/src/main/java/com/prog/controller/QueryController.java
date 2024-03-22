package com.prog.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {

	//localhost:8080/getmessage?name=ram
	//localhost:8080/getmessage?name=ram&course=springboot
	//to read this use @RequestParam("name")
	@GetMapping("/getmessage")
	public String displayMessage(@RequestParam("name") String name,@RequestParam("course") String c,Map<String, Object>model) {
		
		String msg = "hello" +name + "i hpe u r enjy course" +c;
		model.put("msg", msg);
		return "index";
	}
}
