package com.hello.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/test")
	public String test() {
		
		return "here is hello-service ~~~";
		
	}

}
