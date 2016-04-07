package com.epam.dao;

import java.util.List;

import com.epam.vo.Event;

public interface EvenDAOInterface {
	public void addEvent(Event event);
    public void updateEvent(Event event);
    public List<Event> listEvents();
    public Event getEventById(int id);
    public void removeEvent(int id);
}
