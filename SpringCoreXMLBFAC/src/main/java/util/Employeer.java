package util;

public class Employeer 
{
	private Integer id;
	private String name;;
	private Double salary;
//	private Department depart;

	
	public Employeer() {
		
	}
	
	public Employeer(Integer id,String name, Double salary) 
	{
		System.out.println("Contructor is created");
		this.id=id;
		this.name=name;
		this.salary=salary;
//		this.depart=depart;
	}
	
	public String getname() {
		System.out.println("getter is created");
		return name;
	}
	
	public void setname(String name) {
		System.out.println("seter is created");
		this.name=name;
	}
	
	public Integer getid() {
		System.out.println("getter is created");
		return id;
	}
	
	public void setid(Integer id) {
		System.out.println("seter is created");
		this.id=id;
				
	}
	
	public Double getSalary() {
		System.out.println("getter is created");
		return salary;
		
	}
	
	public void setSalary(Double salary) 
	{
		System.out.println("seter is created");
		this.salary=salary;
	}
	
//	public Department getDepart() {
//		return depart;
//	}
//	
//	public void setDepartment(Department depart) {
//		this.depart=depart;
//	}
	
	public String toString() {
		return "{ Employeer id "+id +" name "+ name +" Salary "+salary +" }";
	}
}

