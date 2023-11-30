
/**
 * 
 */

import java.util.Scanner;

 
public class Main {
	
	public static final double PI = Math.PI;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with the radius: ");
		double radius;
		radius = scan.nextDouble();
		
		double circum = circumference(radius);
		double vol = volume(radius);
				
		System.out.printf("Radius: %.2f\n", radius);
		System.out.printf("Circumference: %.2f\n", circum);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.println(String.format("Pi value: %.2f", PI));
			
	}
	
	public static double circumference (double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume (double radius) {
		return ((double)4/3) * PI * (radius * radius * radius);
	}
	
}
