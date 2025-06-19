package com.RestApp.model;

public class Student 
{
	private Integer id;
	private String name;
	private String city;
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
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
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public Student(Integer id, String name, String city, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public Student() {
		super();
		
	}
	
}
