package com.Tset.SpringJpaProject5.model;

import java.util.List;

import com.Tset.SpringJpaProject5.repo.IVaccineRepo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String vaccineName;
	
	private String VaccineCompany;
	
	private Double cost;
	
	public String getVaccineCompany() {
		return VaccineCompany;
	}
	public void setVaccineCompany(String vaccineCompany) {
		VaccineCompany = vaccineCompany;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccine(String vaccineName, String vaccineCompany, Double cost) {
		super();
		this.vaccineName = vaccineName;
		VaccineCompany = vaccineCompany;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccineName=" + vaccineName + ", VaccineCompany=" + VaccineCompany + ", cost="
				+ cost + "]";
	}
	

	
}
