package com.airline.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.flight.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
	List<Booking> findByEmail(String emailId);
	Booking findByPnr(Integer pnr);
}
