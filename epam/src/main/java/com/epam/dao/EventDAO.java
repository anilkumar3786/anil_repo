package com.epam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.vo.Event;

@Repository("eventDAO")
public class EventDAO implements EvenDAOInterface {

	@Autowired
	List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public void addEvent(Event event) {

		events.add(event);

	}

	public void updateEvent(Event event) {

		events.set(event.getEventId(), event);

	}

	public List<Event> listEvents() {
		// TODO Auto-generated method stub
		return events;
	}

	public Event getEventById(int id) {
		for (Event event : events) {
			if (event.getEventId() == id) {
				return event;
			}
		}
		return null;
	}

	public void removeEvent(int id) {

		events.remove(id);

	}

}
