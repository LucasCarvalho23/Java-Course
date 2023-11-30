
/**
 * 
 */

import java.util.Scanner;
import util.Calculator;

 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the radius: ");
		double radius;
		radius = scan.nextDouble();
		
		double circum = Calculator.circumference(radius);
		double vol = Calculator.volume(radius);
				
		System.out.printf("Radius: %.2f\n", radius);
		System.out.printf("Circumference: %.2f\n", circum);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.println(String.format("Pi value: %.2f", Calculator.PI));
			
	}
	

	
}
