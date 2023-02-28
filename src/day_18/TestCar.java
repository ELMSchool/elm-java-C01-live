package day_18;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car3.insertData("red", "Lexus", 160, 2000001);
		
		car1.color = "blue";
		car1.make = "ferrari";
		car1.maxSpeed = 285;
		car1.vinNumber = 10000002;
		
//		System.out.println(car1.color);
//		System.out.println(car1.make);
//		System.out.println(car1.maxSpeed);
//		System.out.println(car1.vinNumber);
//		System.out.println();
//		System.out.println(car2.color);
//		System.out.println(car2.make);
//		System.out.println(car2.maxSpeed);
//		System.out.println(car2.vinNumber);
		System.out.println(car3.color);
		System.out.println(car3.make);
		System.out.println(car3.maxSpeed);
		System.out.println(car3.vinNumber);
		
	}

}
