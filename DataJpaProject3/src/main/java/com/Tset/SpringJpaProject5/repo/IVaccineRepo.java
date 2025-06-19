package com.Tset.SpringJpaProject5.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.Tset.SpringJpaProject5.model.Vaccine;

@Repository
public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer>
//JpaRepository<Vaccine, Integer>
{
	
}
