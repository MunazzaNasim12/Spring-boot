package com.Tset.SpringJpaProject5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Tset.SpringJpaProject5.model.Vaccine;
import com.Tset.SpringJpaProject5.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService
{
	
	IVaccineRepo repo;
	
	@Autowired
	void setRepo(IVaccineRepo repo) 
	{
		this.repo=repo;
	}

	@Override
	public Iterable<Vaccine> fechVaccineInfoBySorting(Boolean status, String... properties) 
	{
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,properties);
		return repo.findAll(sort);
	}

	@Override
	public Iterable<Vaccine> fechVaccineInfoPagination(int pgNo, int pgSize, Boolean status, String... properties) 
	{
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,properties);
		//PageRequest pageable=PageRequest.of(pgNo, pgSize,);
		
		
		//Page<Vaccine>page=repo.findAll(pageable);
		return null;
		
	}

	@Override
	public void fetchVaccineInfoByPagination(int pgSize) 
	{
		long count=4;
		long pageCount=count/pgSize;
		
		pageCount=count%pgSize==0?pageCount:++pageCount;
		
		for(int i=0;i<pageCount;i++) 
		{
			PageRequest pageeable =PageRequest.of(i,pgSize);
			Page<Vaccine>page=repo.findAll(pageeable);
			List<Vaccine>collection=page.getContent();
			collection.forEach(v->System.out.println(v));
			System.out.println("************************************************************************************************");
			
		}
	
	}  
	}
