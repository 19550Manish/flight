package com.airline.flight.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Airline {
	@Id
	@GeneratedValue
	int airlineid;

	private String airlineName;
	private Long contactNumber;
	private String address;
	ArrayList<Flight> flightsList;

	
	public Airline() {

	}

	public Airline(String airlineName, Long contactNumber, String address, ArrayList<Flight> flightsList) {
		super();
		this.airlineName = airlineName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.flightsList = flightsList;
	}

	public int getAirlineid() {
		return airlineid;
	}

	public void setAirlineid(int airlineid) {
		this.airlineid = airlineid;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public ArrayList<Flight> getFlightsList() {
		return flightsList;
	}

	public void setFlightsList(ArrayList<Flight> flightsList) {
		this.flightsList = flightsList;
	}


}
