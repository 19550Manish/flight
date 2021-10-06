package com.airline.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.flight.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline,Integer> {

	Airline findByAirlineName(String airlineName);

}
