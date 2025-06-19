package com.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.model.Employee;
import com.repo.EmployeeRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.repo")
//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		
		EmployeeRepo repo = container.getBean(EmployeeRepo.class);
		
//		List<Employee> employee = repo.getEmplyeeInfo();
//		
//		for(Employee e : employee) {
//			System.out.println(e);
//		}
		
		repo.getEmplyeeInfo().forEach(e->System.out.println(e));
	}

}
