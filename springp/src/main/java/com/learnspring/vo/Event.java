package com.learnspring.vo;

import java.util.Date;

public class Event {

	private int eventId;
	private String eventName;
	private int eventBasePrice;
	private Date eventDate;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int eventId, String eventName, int eventBasePrice, Date eventDate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventBasePrice = eventBasePrice;
		this.eventDate = eventDate;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getEventBasePrice() {
		return eventBasePrice;
	}

	public void setEventBasePrice(int eventBasePrice) {
		this.eventBasePrice = eventBasePrice;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventBasePrice=" + eventBasePrice
				+ ", eventDate=" + eventDate + "]";
	}

}
