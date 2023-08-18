package JourneyCalculator;

import java.util.Scanner;

public class TheJourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("JOurney Distance as Speed And Time");
		Double speed=scan.nextDouble();
		Double time=scan.nextDouble();
		JourneyCalculatorApp journeyCalculatorApp=new JourneyCalculatorApp();
		double distance=journeyCalculatorApp.calculateDistance(speed,time);
		System.out.println(distance);
		
	}
		
		
		
		
	

}
