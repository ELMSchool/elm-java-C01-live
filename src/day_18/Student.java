package day_18;

class Student {
	//fields, memebers, instance variables
	long id;
	String name;
	
	public static void main(String[] args) {
		
		//this is object creation of student class(by the help of 'new' keyword)
		Student student1 = new Student();
		
		System.out.println(student1.id);
		System.out.println(student1.name);
		
		student1.id = 701585;
		student1.name = "John Doe";

		
	}
	
}
