package day_25;

public class User {

	public static void main(String[] args) {

		Dell dell = new Dell("Dell", 1232, 15.0);

		System.out.println(dell.model);  //null
		System.out.println(dell.getName()); //dell
		System.out.println(dell.getModelNumber()); //1232
		System.out.println(dell.getScreenSize());//15.0

	}
}
