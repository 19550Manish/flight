package com.airline.flight.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue()
	int flightId;
	private String flightName;
	private String airlineName;
	private String fromPlace;
	private String toPlace;
	private Date startDateTime;
	private Date endDateTime;
    private int businessSeat;
    private int nonBusinessSeat;
    private float cost;
    
    public Flight() {}

	public Flight(String flightName, String airlineName, String fromPlace, String toPlace, Date startDateTime,
			Date endDateTime, int businessSeat, int nonBusinessSeat, float cost) {
		super();
		this.flightName = flightName;
		this.airlineName = airlineName;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.businessSeat = businessSeat;
		this.nonBusinessSeat = nonBusinessSeat;
		this.cost = cost;
	}

	public void show() {
		System.out.println(this.flightId);
		System.out.println(this.airlineName);
		System.out.println(this.startDateTime);
		System.out.println(this.endDateTime);
		System.out.println(this.businessSeat);
		System.out.println(this.nonBusinessSeat);
		System.out.println(this.cost);
		
	}
	

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public int getBusinessSeat() {
		return businessSeat;
	}

	public void setBusinessSeat(int businessSeat) {
		this.businessSeat = businessSeat;
	}

	public int getNonBusinessSeat() {
		return nonBusinessSeat;
	}

	public void setNonBusinessSeat(int nonBusinessSeat) {
		this.nonBusinessSeat = nonBusinessSeat;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
    
}
