package day_19;
import java.util.*;
public class Showroom {
	
	/*
	 * Static helps us to manage memory allocation
	 * Static belongs to the class itself not to objects
	 * We can't call non static fields in static method
	 * Only way is calling those(non-static) fields through object
	 * */
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();	
		
	
		car1.origin = "Turkey";
		
		car1.maxSpeed = 150;
		car2.maxSpeed = 165;
		car3.maxSpeed = 200;
		
		Car.printSpeedAndOrigin();
		
//		System.out.println(car1.maxSpeed);
//		System.out.println(car2.maxSpeed);
//		System.out.println(car3.maxSpeed);
		
	}

}
