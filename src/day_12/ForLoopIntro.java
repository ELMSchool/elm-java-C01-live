package day_12;

public class ForLoopIntro {
	
	public static void main(String[] args) {
		
		/* initializer -  runs once that's it (1) optional
		 * condition - being check every time before iteration (2) optional
		 * code block - runs after condition check (3) optional
		 * update - each time after iteration and checks condition (4) 
		 * 
		 * */
		String str = "java"; // avaj 
									 						
		
		int end = 5;
		int sum = 0;
		
		
		for (int i = 0; i<= end; i++) {
			sum+=i;
		}
		
		
		System.out.println(sum);
		
	}

}
