package com.example.springJenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoRestController {

	
	@GetMapping("/hello")
	public String greetings(){
		return "Hello World!!";
	}
}
