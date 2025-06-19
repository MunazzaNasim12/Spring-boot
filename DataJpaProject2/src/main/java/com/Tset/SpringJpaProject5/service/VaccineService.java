package com.Tset.SpringJpaProject5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Tset.SpringJpaProject5.model.Vaccine;
import com.Tset.SpringJpaProject5.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService
{
	@Autowired
	IVaccineRepo repo;
	
	@Override
	public String registerVaccineDetail(Vaccine vaccine) {
		Vaccine vac=repo.save(vaccine);
		return "Vaccine info Stored with id "+vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccine) {
		
		return repo.saveAll(vaccine);
	}

	@Override
	public Long getCount() 
	{
	
		return repo.count();
	}

	@Override
	public Boolean checkAvalible(Integer id) 
	{
		
		return repo.existsById(id);
	}

}
