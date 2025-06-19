package com.RestApp.service;

import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingService 
{
	String generateGreeting();
}
