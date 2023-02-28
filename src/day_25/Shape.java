package day_25;

public class Shape {
	
	private String name;
	private int length;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	
	
	public Shape() {
		
	}
	
	
	public Shape(String name, int lenght) {
		
		this.name = name;
		this.length = lenght;
		
	}
	
	public String toString() {
		
		return name + " = " + length; 
	}
	

}
