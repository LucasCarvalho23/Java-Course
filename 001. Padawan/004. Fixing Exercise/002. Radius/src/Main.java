
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double pi = 3.1415;
		double radius;
		double result;
		
		radius = scan.nextDouble();
		result = (radius * radius) * pi;
		
		System.out.println("the value is: " + result);
		
		scan.close();
	}

}
