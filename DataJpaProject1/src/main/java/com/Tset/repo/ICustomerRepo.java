package com.Tset.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tset.model.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Integer>
{

}
