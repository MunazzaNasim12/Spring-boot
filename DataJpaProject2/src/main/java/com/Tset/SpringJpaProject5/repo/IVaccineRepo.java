package com.Tset.SpringJpaProject5.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Tset.SpringJpaProject5.model.Vaccine;

@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer>
{

}
