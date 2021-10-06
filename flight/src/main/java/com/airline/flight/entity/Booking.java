package com.airline.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.airline.flight.Enum.Meal;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	int bookingId;
	private String name;
	private String emailId;
	private String flightName;
	private int Pnr;
	private String seatNo;
	private Meal meal;

	public Booking() {
	}

	public Booking(String name, String emailId, String seatNo, Meal meal) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.seatNo = seatNo;
		this.meal = meal;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getPnr() {
		return Pnr;
	}

	public void setPnr(int pnr) {
		Pnr = pnr;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

}
