package com.airline.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.flight.entity.Flight;



public interface FlightRepository extends JpaRepository<Flight,Integer> {

	Flight findByFlightId(int flightId);


}
