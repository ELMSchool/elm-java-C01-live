package day_21;

public class Test {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Fred", 101, "DELL");
		
		t1.printFields(t1);
		t1 = t1.provideAutomatedFields();
		t1.printFields(t1);
	
	}
	



}
//Const 2
//Const 3
//Fred
//101
//Dell
//Default
//100
//ELM
