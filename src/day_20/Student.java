package day_20;

public class Student {
	
	String name;
	String lastName;
	static String school ="ELM";
	
	public Student() {

	}
	
	public Student(String schoolName) {
		school = schoolName;
	}
	
	public Student(String n, String l) {
		
		name = n;
		lastName = l;
	}
	
	
	
	public void insertData(String n, String l) {
		
		name = n;
		lastName = l;
	}
	

}
