package util;

public class Department {
	
	private Integer id;
	private String name;

	public Department() {
		
	}
	public Department(Integer id, String name) {
		this.id=id;
		this.name=name;
	}
//	public String toString() {
//		return "{id "+id+ " name " +name +" }";
//						
//	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}


