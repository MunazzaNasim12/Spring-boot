package com.SpringBoot01.Service;

import java.time.LocalTime;

public class Geeting implements IGeetingsService {

	private LocalTime time;
	
	@Override
	public String generateGreeting(String name) {
		int hour =time.getHour();
		if(hour<12)
			return "Good moring "+name;
		else if (hour <16)
			return "Good Afternoon "+name;
		else
		return "Good night "+name;
	}

}
