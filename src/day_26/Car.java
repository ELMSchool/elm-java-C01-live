package day_26;

public class Car {
	
	private String make;
	private int mileage;
	 int maxSpeed;
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	
	public void move() {
		
		System.out.println("Car is moving");
		
	}
	

	public Car(String make, int mileage, int maxSpeed) {
		
		setMake(make);
		setMileage(mileage);
		setMaxSpeed(maxSpeed);
	
		
	}
	
	public void printAll() {
		System.out.println(getMake()+"\n"+getMileage()+"\n"+getMaxSpeed());
	}

}
