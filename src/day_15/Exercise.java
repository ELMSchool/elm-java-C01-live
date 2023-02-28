package day_15;

public class Exercise {
	
	public static void main(String[] args) {
		
		int numbers [][] = {
								{1,2,3}, 
								{6, 12, 15, 2}, 
								{11, 13, 8}
							};
		
		int sum = 0;
		for (int i = 0; i<numbers.length; i++) {	
			
			//int [] arr = numbers[i]; //{1,2,3}			
			for(int k = 0; k<numbers[i].length; k++) {
				
				if (numbers[i][k] % 2 == 0) {
					
					sum += numbers[i][k];
				}
	
				
			}
		}
		System.out.println(sum);
		
	}

}
