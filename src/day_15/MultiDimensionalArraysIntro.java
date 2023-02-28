package day_15;
import java.util.Arrays;

public class MultiDimensionalArraysIntro {
	
	public static void main(String[] args) {
		
		String [] countries = new String [4];
		countries[0] = "USA";
		countries[1] = "Italy";
		countries[2] = "Japan";
		countries[3] = "Egypt";  
		//[USA, Italy, Japan, Sudan] { {}, {}, {}, {} }
		
		String [] citiesOfUSA =   {"NYC", "Alexandria", "Atlanta", "Houston"};
		String [] citiesOfItaly = {"Rome", "Venice", "Naples", "Milan"};
		String [] citiesOfJapan = {"Tokyo", "Osaka", "Nara", "Kobe"};
		String [] citiesOfEgypt = {"Cairo", "Giza", "Luxor", "Aswan"};
		
		//2D Array
		String [][] worldCities = new String [4][4];
		worldCities[0] = citiesOfUSA;
		worldCities[1] = citiesOfItaly;
		worldCities[2] = citiesOfJapan;
		worldCities[3] = citiesOfEgypt;
		System.out.println(Arrays.deepToString(worldCities));
		
		String city = 	worldCities[3][3];
		System.out.println(city);
	/*
	 *[	  0				1			2		  3	
	 *0	[NYC, 		Alexandria,  Atlanta, 	Houston], 
	 *1	[Rome, 		Venice, 	 Naples,  	Milan], 
	 *2	[Tokyo, 	Osaka, 		 Nara, 		Kobe], 
	 *3	[Cairo, 	Giza, 		 Luxor, 	Aswan]
	 *]
	 * */
		
		
	}

}
