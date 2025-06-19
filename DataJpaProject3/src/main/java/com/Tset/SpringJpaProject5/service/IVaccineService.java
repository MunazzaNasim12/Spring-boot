package com.Tset.SpringJpaProject5.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Tset.SpringJpaProject5.model.Vaccine;
import com.Tset.SpringJpaProject5.repo.IVaccineRepo;

@Repository
public interface IVaccineService 
{
	Iterable<Vaccine>fechVaccineInfoBySorting(Boolean status,String...properties);;
	Iterable<Vaccine>fechVaccineInfoPagination(int pgNo,int pgSize ,Boolean status ,String...properties);
	void fetchVaccineInfoByPagination(int pgSize);
	
}
