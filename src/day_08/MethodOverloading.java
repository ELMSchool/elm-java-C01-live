package day_08;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		
//		Math.max(12.3, 5.1);
//		Math.max(8, 7);
//		
//		findTheGreatest(14, 14);
//		findTheGreatest(14.5, 20.1);
		/// will find avarage num for 3 ints will return int
		/// 						    double			double	
		
		orderPizza("peperonsdfas");
		orderPizza("fasdf", 5);
	}
	//We are using same method name but different parameters within same class
	public static void orderPizza(String type) {
		
		System.out.println("simple " + type + " pizza");
	}
	
    public static void orderPizza(String type, int slice) {
		
		System.out.println(type + " pizza. " +  slice + " slice");
	}
	   
    public static void orderPizza(String type, int slice, boolean extraSauce) {
		
  		System.out.println(type + " pizza. " +  slice + " slice. " + ((extraSauce) ? "Extra sauce please ": " No extra sauce"));
  	}
	
	public static int findTheGreatest(int a, int b) {
		
		int max = (a>b) ? a : b;
		
		return max;
	}
	
	public static double findTheGreatest(double a, double b) {
		
		double max;
		if (a>b) {
			max = a;
		}else {
			max = b;
		}
		
		return max;
	}
	
	public static double findTheGreatest(double a, double b, double c) {
		
		return findTheGreatest(a, findTheGreatest(c, b));
	}
		
	public static int demo (int a, String b) {
		return 0;
	}

	public static int demo (String b, int a) {
		return 0;
	}
}
