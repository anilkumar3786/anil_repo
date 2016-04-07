package com.epam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.dao.EventDAO;
import com.epam.vo.Event;

@Service("eventService")
public class EventService implements EventServiceInterface {

	@Autowired
	EventDAO eventDAO;
	
	public void addEvent(Event event) {
		eventDAO.addEvent(event);
		
	}

	public void updateEvent(Event event) {
		eventDAO.updateEvent(event);
		
	}

	public List<Event> listEvents() {
		
		return eventDAO.listEvents();
	}

	public Event getEventById(int id) {
		
		return eventDAO.getEventById(id);
	}

	public void removeEvent(int id) {
		
		eventDAO.removeEvent(id);
		
	}

}
