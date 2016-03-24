package com.learnspring.servicetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.learnspring.vo.Event;

public class EventTest {

	public static void main(String args[]) throws ParseException{
		
		String input = "06/10/2013 18:29:09";
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	    java.util.Date dt = sdf.parse(input);
	    java.sql.Date dtSql = new java.sql.Date(dt.getTime());
	    
	    
		Event event1 = new Event(1, "RoboMovie", 100, dtSql);
		
	}
}
