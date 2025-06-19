package util.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.main.TSet;

public class LunchApp {
	public static void main(String args[]) 
	{
		ApplicationContext contain=new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		TSet t=contain.getBean(TSet.class);
		
		
		{
			boolean status=t.disp(1490.0);
			if(status) 
				System.out.println("Enrolled to cource");
				else
					System.out.println("Failed to Enrolled");
			
		}
	}		
}
