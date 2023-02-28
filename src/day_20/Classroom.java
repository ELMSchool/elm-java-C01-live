package day_20;

public class Classroom {

	public static void main(String[] args) {

		/*
		 * 1. If you have declared parameterized constructor, compiler will not create
		 * default constructor for us.
		 * 
		 * 2. Constructor name must be same as the Class name
		 * 
		 * 3. Constructors don't have return type and can't be defined
		 * 
		 * 4. Overloading Constructor
		 */

		// default, parameterized, overloaded
		// constructor - Special method in java that allocates space in Heap memory
		// for object

		// default constructor
		Student s1 = new Student();

		s1.insertData("Fred", "Mercury");

		System.out.println(s1.name + " " + s1.lastName);

		Student s2 = new Student("Ted", "Twain");
		System.out.println(s2.name + " " + s2.lastName);

		Student s3 = new Student();
		System.out.println(s3.name + " " + s3.lastName);

	}

}
