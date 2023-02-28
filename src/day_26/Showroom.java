package day_26;

public class Showroom {

	
	public static void main(String[] args) {

		Mercedes gt= new Mercedes("Mercedes", 5, 250, "GT63", 4);
		
		//System.out.println(gt.toString());
		Person person = new Person("Fuad Suleyman", 777777777, gt);
		System.out.println(person.toString());
		
	}
}
