package com.Tset.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	@Id
	private Integer id;
	private String name;
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer( Integer id,String name, String city) {
		super();
		this.id=id;
		this.name = name;
		this.city = city;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
