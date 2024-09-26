package com.example.demo_rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoRestController {
	
	 private Map<Integer, Ticket> bookedTickets = new HashMap<>();

	    public DemoRestController() {
	    	// Initialize with three random tickets
	        bookedTickets.put(1, new Ticket(1, "John Doe", "123 Main St", 2));
	        bookedTickets.put(2, new Ticket(2, "Jane Smith", "456 Elm St", 3));
	        bookedTickets.put(3, new Ticket(3, "Bob Johnson", "789 Oak St", 1));
	    
	        System.out.println("Constructor DemoRestController()");
	    }
		
		@GetMapping("/abcd")
		public String met1() {
			System.out.println("------jjjjjjjj--------");
			return "Hello World";
		}
		
		//checking the ticket is available or not
		@GetMapping("/ticket")
		public Object getTicket(@RequestParam("tid") int ticketid) {
		    Ticket ticket = bookedTickets.get(ticketid);
		    if (ticket == null) {
		        return "Ticket not found";
		    }
		    return ticket;
		
			
		}
		
		@PostMapping("/book")
		public Ticket bookTicket(@RequestBody Ticket ticket) {
		    System.out.println("Booking Ticket: " + ticket);
		    bookedTickets.put(ticket.getId(), ticket);
		    return ticket;
		}
		
		@DeleteMapping("/cancel")
		String cancelTicket(@RequestParam("tid") int ticketid) {
			return "Ticket with id "+ ticketid +" is cancelled"; 
			
		}
		
}
