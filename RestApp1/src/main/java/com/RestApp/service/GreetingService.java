package com.RestApp.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService
{

	@Autowired
	private LocalTime time;
	
	@Override
	public String generateGreeting() 
	{
		int hour =time.getHour();
		if(hour <12)
			return "Good Moring...Tody is your day drea ";
		else if(hour <16)
			return "Good evening... take tea break ";
		else
			return "Good Night... Sweet dreem...";
	}

}
