package com.example.demo_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


	public  DemoRestController() {
		System.out.println("Constructor DemoRestController()");
	}
		
		@GetMapping("/abcd")
		public String met1() {
			System.out.println("------jjjjjjjj--------");
			return "Hello World";
		}
		
		@GetMapping("/person")
		User getUser() {
			return new User(1,"some name","some addr");
			
		}
	
}
