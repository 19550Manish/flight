package com.airline.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue
	int userId;
	private String name;
	private String emailId;
	public int getUserId() {
		return userId;
	}
	public User() {}
	
	public User(String name, String emailId) {
		super();
		this.name = name;
		this.emailId = emailId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	

}
