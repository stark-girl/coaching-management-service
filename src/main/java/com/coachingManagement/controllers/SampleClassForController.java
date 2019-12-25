package com.coachingManagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleClassForController {
	
	
	
	@GetMapping(path="/yolo")
	public String samplefunc() {
		return "Priyanshi";
	}

}
