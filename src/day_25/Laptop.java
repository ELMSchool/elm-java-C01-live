package day_25;

public class Laptop {

	private String name;
	private long modelNumber;
	private double screenSize;

	public Laptop(String name) {
			
	}

	public Laptop(String name, long model) {

	}

	public Laptop(String name, long modelNumber, double screenSize) {
		this.name = name;
		this.modelNumber = modelNumber;
		this.screenSize = screenSize;
	}

	public long getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(long modelNumber) {
		this.modelNumber = modelNumber;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getName() {

		return this.name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void printFields() {
		System.out.println(name);
		System.out.println(modelNumber);
		System.out.println(screenSize);
	}

}
