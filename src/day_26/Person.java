package day_26;

public class Person {

	//Aggregation
	//Person HAS-A Mercedes
	String name;
	long phoneNumber;
	Mercedes mercedes;
	
	
	public Person (String name, long phoneNumber, Mercedes mercedes) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mercedes = mercedes;
		
	}
	

	public String toString() {
		
		return this.name +"\n"+
			   "Phone: " + this.phoneNumber+"\n"+
				"Car: " + mercedes.toString();
	}
}
