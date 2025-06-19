package com.Tset.SpringJpaProject5.service;

import org.springframework.stereotype.Repository;

import com.Tset.SpringJpaProject5.model.Vaccine;

@Repository
public interface IVaccineService 
{
	String registerVaccineDetail(Vaccine vaccine);
	
	Iterable<Vaccine>registerMultipleVaccine(Iterable<Vaccine>vaccine);
	
	Long getCount();
	
	Boolean checkAvalible(Integer id);
}
