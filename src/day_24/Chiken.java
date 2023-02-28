package day_24;

public class Chiken extends Bird{
	
	int dailyEggCount;
	
	{
		System.out.println("non-static block from Chicken");
	}
	
	static {
		System.out.println("static block from Chicken");
	}
	

}
