package day_21;

public class Teacher {

    String name;
	int id;
	static String school;


	public Teacher() {

		System.out.println("No-ar Constructor");
		
	}

	public Teacher(String name, int id) {
		System.out.println("Const 2.");
		this.name = name; //Fred
		this.id = id;//101

	}
	
	public Teacher(String name, int id, String school) {
		this(name, id);
		this.school =school; //DELL
		System.out.println("Const 3.");
		
//		printFields(this);
	}
	

	public static void printFields(Teacher teacher) {
		
		System.out.println(teacher.name);
		System.out.println(teacher.id);
		System.out.println(teacher.school);
	}
	
	public static void print() {
		
		System.out.println("This is static print method");
	}
	
	
	public Teacher provideAutomatedFields() {
		this.name = "Default";
		this.id = 100;
		this.school = "ELM";
		
		return this;
	}

}
