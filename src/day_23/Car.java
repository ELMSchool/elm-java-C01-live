package day_23;

public class Car {

	private String make;
	private String model;
	private int maxSpeed;
	private int currentSpeed;
	private int distance;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Car(String make, String model, int maxSpeed, int currentSpeed) {

		this.make = make;
		this.model = model;
		this.maxSpeed = maxSpeed;
		if (currentSpeed > maxSpeed) {
		this.currentSpeed = maxSpeed;
		}else {
			this.currentSpeed = currentSpeed;
		}
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed > this.maxSpeed) {
			this.currentSpeed = maxSpeed;
			}else {
				this.currentSpeed = currentSpeed;
			}
	}


	public String calculateTravelTime(int distance){
					// 140 / 66 	
		double timeInDouble = (distance*1.0) / (this.currentSpeed*1.0); //1.5
		int minutes = (int)(100*timeInDouble*60)/100; //2.12 * 60
		System.out.println(timeInDouble);
		System.out.println(minutes);			
		String time = ""+ minutes/60 +" hours "+ minutes%60 +" minutes";
		return time;
	}

	
	//make model is currently going 60 mph.
	//it will take "time" to reach the destination.
	
	
	public void infoAboutCar() {
		
		System.out.println(this.make + " " + this.model + " is currently going " + this.currentSpeed +" mph.\n"+
						   "It will take "+ calculateTravelTime(this.distance)+" to reach destination.\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}