package day_25;

public class Teacher extends School{
	String major; //null
	int numberOfLessons; //null
	
	
	public Teacher (String name, String major, int numberOfLess) {
	//	super(name);
		this.major = major;
		this.numberOfLessons = numberOfLess;
		
	}
	
	public void print() {
		System.out.println(super.name);
		System.out.println(super.id);

	}
	
}
