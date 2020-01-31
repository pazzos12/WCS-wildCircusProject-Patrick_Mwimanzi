package com.WildCodeSchool.wildcircus.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerformanceController {
	
	@GetMapping("/performance")
	public String Perfomance() {
		
		return "performance";
	}

}
