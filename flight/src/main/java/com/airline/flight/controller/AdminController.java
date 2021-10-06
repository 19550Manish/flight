package com.airline.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airline.flight.entity.Airline;
import com.airline.flight.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/api/v1.0/flight/airline/register")
	public void addAirline(@RequestBody Airline airline) {
		adminService.addAirline(airline);
	}
	

}
