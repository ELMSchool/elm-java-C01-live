package day_22;

public class Wrappers {
	
	public static void main(String[] args) {
		
		
		String str = "java"; //object
		int i = 5;			 //primitive
		
		//to give object appearances to primitives
		
		Byte b = 1;
		Short s = 10;
		Integer num = 5;
		Long l = 1000l;
		Float f = 561651.121f;
		Double d = 11.255;
		Boolean bool = true;
		Character ch = 'a';
		
		String startYear = "2023"; // 2025
		int year= Integer.valueOf(startYear);  //converted From String to Integer
		String endYear = ""+ (year+2);
		System.out.println(endYear);
		
		
	}

}
