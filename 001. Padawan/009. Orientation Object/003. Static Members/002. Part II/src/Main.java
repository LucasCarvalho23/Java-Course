
/**
 * 
 */

import java.util.Scanner;
import util.Calculator;

 
public class Main {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the radius: ");
		double radius;
		radius = scan.nextDouble();
		
		double circum = calculator.circumference(radius);
		double vol = calculator.volume(radius);
				
		System.out.printf("Radius: %.2f\n", radius);
		System.out.printf("Circumference: %.2f\n", circum);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.println(String.format("Pi value: %.2f", calculator.PI));
			
	}
	

	
}
