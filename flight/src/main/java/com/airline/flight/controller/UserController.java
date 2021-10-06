package com.airline.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.airline.flight.entity.Booking;
import com.airline.flight.entity.Flight;
import com.airline.flight.service.UserService;




public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/api/v1.0/flight/booking/{flightId}")
	String bookingFlight(@RequestBody Booking bookTicket,@PathVariable int flightId ) {
	    userService.book(bookTicket,flightId);
	    return "ticket is booked pnr is"+bookTicket.getPnr();
	}
	
	@PostMapping("/api/v1.0/flight/search")
	Flight searchFlight(@RequestBody Flight flight) {
		return userService.searchFlight(flight);
	}
	
	@GetMapping("/api/v1.0/flight/ticket/{pnr}")
	Booking getBookedTicketsByPnr(@PathVariable int pnr) {
	return userService.getBookedTicket(pnr);
}
	@DeleteMapping("/api/v1.0/flight/booking/cancel/{pnr}")
	public void cancelTicket(@PathVariable int pnr) {
		userService.cancelBooking(pnr);
	}
	
}
