package com.RestApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.RestApp.service.IGreetingService;

@Controller
public class GreetingController 
{
	@Autowired
	private IGreetingService service;
	
	@GetMapping("/geet1")
	@ResponseBody
	public String getWish1() 
	{
		String response=service.generateGreeting();
		return response;
	}
	
	@GetMapping("/geet2")
	@ResponseBody
	public ResponseEntity<String>getWish2()
	{
		String response=service.generateGreeting();
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
		
	}
}
