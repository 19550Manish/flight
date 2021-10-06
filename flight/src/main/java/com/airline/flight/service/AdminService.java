package com.airline.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.flight.entity.Airline;
import com.airline.flight.repository.AirlineRepository;


@Service
public class AdminService {
	@Autowired
	AirlineRepository airlineRepository;
	
	
	public void addAirline(Airline airline ) {
		airlineRepository.save(airline);
	}
	public void deleteAirline(Airline airline ) {
		airlineRepository.delete(airline);
	}
	public Airline get(String airlineName) {
		return airlineRepository.findByAirlineName(airlineName);
	}
		

}
