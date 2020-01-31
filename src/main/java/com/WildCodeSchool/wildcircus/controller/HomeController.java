package com.WildCodeSchool.wildcircus.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String WildCircus(Model model) {
		
		return "home";
		
	}
	
	@GetMapping("/home")
	public String HomePage() {
		
		return "home";
		
	}

}
