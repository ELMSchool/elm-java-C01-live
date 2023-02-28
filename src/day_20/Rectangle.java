package day_20;

public class Rectangle {
	/*
	 * This class will have: 
	 * 4 non-static fields -> int length, int width, int perm, int area
	 * 1 parameterized constructor(int a, int b)
	 * 2 methods. perimeter(), area()
	 * */

	int length;
	int width;
	int area;
	int perimeter;
	
	public Rectangle(int l, int w) {
		
		length = l;
		width = w;
		
	}
	
	public void area() {
		area = length * width;
		
	}
	
	public void perimeter() {
		perimeter = (length + width)*2;
	}
}
