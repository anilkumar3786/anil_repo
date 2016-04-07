package com.epam.vo;

import java.util.Calendar;

public class Event {

	private int eventId;
	private String eventName;
	private int eventBasePrice;
	private Calendar eventDate;
	private int eventRating;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int eventId, String eventName, int eventBasePrice, Calendar eventDate, int eventRating) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventBasePrice = eventBasePrice;
		this.eventDate = eventDate;
		this.eventRating = eventRating;
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

	public Calendar getEventDate() {
		return eventDate;
	}

	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}

	public int getEventRating() {
		return eventRating;
	}

	public void setEventRating(int eventRating) {
		this.eventRating = eventRating;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventBasePrice=" + eventBasePrice
				+ ", eventDate=" + eventDate + ", eventRating=" + eventRating + "]";
	}

}
