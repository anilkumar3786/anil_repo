package com.learnspring.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.learnspring.vo.Event;

public class EventDAO {

	List<Event> eventsList = new ArrayList<Event>();

	public void create(Event event) {
		eventsList.add(event);

	}

	public void remove(Event event) {

		eventsList.remove(event);
	}

	public Event getEventByName(String eventName) {

		for (Event event : eventsList) {
			if (event.getEventName() == eventName) {
				return event;
			}
		}
		return null;

	}

	public void getAllEvents() {

		Iterator<Event> itr = eventsList.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Event event = (Event) itr.next();
			System.out.println(event.getEventId() + " " + event.getEventName() + " " + event.getEventDate() + " "
					+ event.getEventBasePrice());
		}
	}

}
