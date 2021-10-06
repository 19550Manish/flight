package com.airline.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.flight.entity.Booking;
import com.airline.flight.entity.Flight;
import com.airline.flight.repository.BookingRepository;
import com.airline.flight.repository.FlightRepository;



@Service
public class UserService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	public Flight searchFlight(Flight flight) {
		return flightRepository.findByFlightId(flight.getFlightId());
	}
	
	public void book(Booking bookTicket,int flightId) {
		bookTicket.setFlightName(flightRepository.findByFlightId(flightId).getFlightName());
		bookTicket.setPnr((int)Math.random());
	}

	
	public Booking getBookedTicket(int pnr) {
		return bookingRepository.findByPnr(pnr);
	}
	
	public void cancelBooking(int pnr) {
		bookingRepository.delete(getBookedTicket(pnr));
	}
    

}
