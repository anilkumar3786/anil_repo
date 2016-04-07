package com.epam.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.epam.vo.Event;
import com.epam.vo.User;

@Component("bookingService")
public class BookingService {

	Map<User, Event> bookTicket = new HashMap<User, Event>();

	int getTicketPrice(Event event, int noOfseats, User user) {

		return event.getEventBasePrice();
	}

	void bookTicket(User user, Event event) {

		bookTicket.put(user, event);
	}

}
