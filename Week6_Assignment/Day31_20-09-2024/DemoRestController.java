package com.example.demo_rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tkt")
public class DemoRestController {


	public  DemoRestController() {
		System.out.println("Constructor DemoRestController()");
	}
		
		@GetMapping("/hello")
		public String met1() {
			System.out.println("------jjjjjjjj--------");
			return "Hello World";
		}
		
		@GetMapping("/ticket")
		//127.0.0.1:8081/ticket?tid=6234
		ResponseEntity<Ticket> getUser(@RequestParam("tid") int ticketid) {
			//get ticket with tid ticket id from collection

			Ticket ticket =  new Ticket(ticketid,"some name","some addr", 3);
			ResponseEntity<Ticket> rentity = new ResponseEntity(ticket, HttpStatus.OK);
			return rentity;
		}
		
		@PostMapping("/book")
		//@RequestBody creates java object from Request
		ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket) {
			System.out.println("Booking Ticket: "+ticket);
			ticket.setId(100);
			ResponseEntity<Ticket> rentity = new ResponseEntity(ticket, HttpStatus.CREATED);
			return rentity;
		
		}
		
		//@PathVariable
		//localhost:8180/tkt/cancelp/6543
		@DeleteMapping("/cancelp/{ticketid}/ticket")
		ResponseEntity<String> cancelPTicket(@PathVariable int ticketid){
			String str = "Successfully Cancelled the ticket with id "+ticketid;
			return new ResponseEntity<String>(str,HttpStatus.OK);
			
		}
		
		@DeleteMapping("/cancel")
		String cancelTicket(@RequestParam("tid") int ticketid) {
			return "Ticket with id "+ ticketid +" is cancelled"; 
			
		}
		
}
