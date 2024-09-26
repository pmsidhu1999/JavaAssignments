package com.example.demo_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@GetMapping("/hello")
	String met () {
		return "Hello from UserController";
	}
}
