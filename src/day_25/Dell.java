package day_25;

public class Dell extends Laptop{



	



	public Dell(String name, long modelNumber, double screenSize) {
		super(name, modelNumber, screenSize);
		// TODO Auto-generated constructor stub
	}



	String model;
	String OS;
	int memory;
	
	
	
	@Override
	public void printFields() {
		
		System.out.println(model);
		System.out.println(OS);
		System.out.println(memory);
	}
	
	
	
}
