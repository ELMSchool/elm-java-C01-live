package day_19;

public class Car {
	//fields, instance variables
	static int maxSpeed;
	String make;
	String color;
	double price;
	long vinNumber;
	static String origin = "USA";
	
	public void insertData(int speed, String m, String clr, double p, long vin) {
		maxSpeed = speed;
		make = m;
		color = clr;
		price = p;
		vinNumber = vin;
	}
	
	public  void printCar() {
		
		System.out.println("$"+price + " "+color + " "+ make +" VIN Number: " + vinNumber+ 
				" Max Speed: "+ maxSpeed );
		
	}
	
	public static void printSpeedAndOrigin() {
		
		System.out.println("Origin: "+origin +"\nMax Speed: "+maxSpeed);
	}

}
