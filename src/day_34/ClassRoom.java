package day_34;

public class ClassRoom {

	public static void main(String[] args) {
		HighSchoolStudent hs = new HighSchoolStudent();
		
		
		try {
			
			System.out.println(2/0);
		}catch(ArithmeticException e){
			
			System.out.println("yeaaa");
		}
		System.out.println("after catch");
	}
}
