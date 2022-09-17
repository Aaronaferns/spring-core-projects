package com.aaron.spring.springcore.assignment1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int ticketId;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	@PostConstruct
	public void init() {
		System.out.println("This is the init function.");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("This is the destroy function.");
	}

	@Override
	public String toString() {
		return "TicketReservation [ticketId=" + ticketId + "]";
	}
	
	
}
