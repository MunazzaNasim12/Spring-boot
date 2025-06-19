package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.Department;
import util.Employeer;

public class LunchApp 
{
	public static void main(String args[]) 
	{
	ApplicationContext container =new ClassPathXmlApplicationContext("ApplicationConfig.xml");
	
//	Department dep=container.getBean(Department.class);
//	System.out.println(dep);
	
	Employeer emp=container.getBean(Employeer.class);
	System.out.print(emp);
	
	}
}
