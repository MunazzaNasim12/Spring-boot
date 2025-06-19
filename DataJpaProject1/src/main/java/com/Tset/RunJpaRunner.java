package com.Tset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Tset.model.Customer;
import com.Tset.repo.ICustomerRepo;

@Component
public class RunJpaRunner implements CommandLineRunner {

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
	repo.save(new Customer(2,"Saad","Amravati"));

	}

}
