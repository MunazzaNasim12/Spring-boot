package util.main;

public class TSet 
{
//	target class
	
	private ICourse course;
	
	//Constructor injection 
	
	public TSet (ICourse course) {
		
		this.course=course;
	}
	
	public TSet() {
	}
	
	public void setICoure(ICourse course) {
		this.course=course;
	}
	
	public boolean disp(double amount) 
	{
		return course.getTheCourse(amount);
	}
	
	
}
