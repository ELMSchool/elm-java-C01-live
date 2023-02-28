package day_02;

import java.util.Scanner;

public class TimeCalc {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int currentHour = scan.nextInt();
		int currentMin = scan.nextInt();
		//current time -> 20:15 => 20*60+15
		/*
		 * 1440 - 100%
		 * 1215 - x
		 * 1440 * x = 1215 * 100;
		 * int passedPercentage = 121500 / 1440
		 * */
		int totalMinsInDay = 24 * 60;
		int passedTimeInMins = 20*60+15;
		int remainingMins = totalMinsInDay - passedTimeInMins;
		int passedPercentage = 121500 / 1440;
		int remainingPercentage = 100-passedPercentage;
		
		System.out.println(totalMinsInDay);
		System.out.println(passedTimeInMins);
		System.out.println(remainingMins);
		System.out.println(passedPercentage);
		System.out.println(remainingPercentage);

		
	}
	
	

}
