package com.tset.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LunchApp 
{
	public static void main(String args[])
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
	}
}
