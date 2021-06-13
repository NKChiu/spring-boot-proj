package com.example.servingwebcontent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	Logger log = LoggerFactory.getLogger(getClass());
		
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		log.info("gretting api execute.");
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/get")
	@ResponseBody
	public String get() {
		log.info("get api execute.");
		return "get";
	}
}
