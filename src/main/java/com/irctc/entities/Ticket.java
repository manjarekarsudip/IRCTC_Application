package com.irctc.entities;

import java.util.Date;

public class Ticket {

	private String ticketId;
	
	private String userId;
	
	private String source;
	
	private String destination;
	
	private String dateofTravel;
	
	private Train train;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDateofTravel() {
		return dateofTravel;
	}

	public void setDateofTravel(String dateofTravel) {
		this.dateofTravel = dateofTravel;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Ticket(String ticketId, String userId, String source, String destination, String dateofTravel, Train train) {
		super();
		this.ticketId = ticketId;
		this.userId = userId;
		this.source = source;
		this.destination = destination;
		this.dateofTravel = dateofTravel;
		this.train = train;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTicketInfo() {
		return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", ticketId, userId, source, destination, dateofTravel);
	}
}
