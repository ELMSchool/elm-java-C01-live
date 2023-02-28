package day_30;

public class Student {

	String firstName;
	String lastName;
	int id;
	int age;
	

	public Student(String firstName, String lastName, int id, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + " lastName=" + lastName + " id=" + id + " age=" + age;
	}
	
	
	
}
