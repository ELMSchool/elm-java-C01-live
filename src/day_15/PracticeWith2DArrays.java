package day_15;
import java.util.*;
public class PracticeWith2DArrays {
	
	
	public static void main(String[] args) {

		String [] citiesOfUSA =   {"NYC", "Alexandria", "Atlanta", "Houston"};
		String [] citiesOfItaly = {"Rome", "Venice", "Naples", "Milan"};
		String [] citiesOfJapan = {"Tokyo", "Osaka", "Nara", "Kobe"};
		String [] citiesOfEgypt = {"Cairo", "Giza", "Luxor"};
		
		//2D Array
		String [][] worldCities = {citiesOfUSA, citiesOfItaly, citiesOfJapan, citiesOfEgypt};
		
								//4
		for (int i = 0; i < worldCities.length; i++) {
			
//				System.out.println(Arrays.toString(worldCities[i]));
			
			for (int a = 0; a < worldCities[i].length; a++) {
				
				System.out.println(worldCities[i][a]);
				
			}
		}
		
		
	}

}
