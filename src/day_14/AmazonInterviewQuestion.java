package day_14;
import java.util.Arrays;
public class AmazonInterviewQuestion {
	
	public static void main(String[] args) {
		//winter                      summer
		// [0, 5, -1, 3, 7, 5, 7, 8, 10, 11, 9]
		
		//*summer temp cannot be less than or equal to winter temp;
		//the highest temp of winter must be less than the coldest temp of summer
		int [] temperatures = {0, 5, -1, 3, 7, 5, 7, 8, 10, 11, 9, 5};
		
		for (int i = 1; i < temperatures.length; i++) {
			
			int [] winterDays = Arrays.copyOf(temperatures, i); //[0, 5, -1]
			int [] summerDays = Arrays.copyOfRange(temperatures, i, temperatures.length);//[3,7,5,7,8,10,11,9]
			Arrays.sort(winterDays);
			Arrays.sort(summerDays);
			
			if (winterDays[winterDays.length -1] < summerDays[0]) {
				
				System.out.println("Summer temperature starts from index "+ i +" => " +temperatures[i]+"°C");
				return;
			}

		}
		
		System.out.println("It is always winter like my life");
	}

}
