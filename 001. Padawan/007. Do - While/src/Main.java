
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Double degree, fahrenheit;
		char value;
		
		do {
			System.out.printf("Type how many degrees are in Celsius scale:");
			degree = scan.nextDouble();
			
			fahrenheit = ((9 * degree) / 5) + 32;
			
			System.out.printf("The value in Celsius is: %.1f\n", degree);
			System.out.printf("The value in Fahrenheit is: %.1f\n", fahrenheit);
			System.out.println("Do you want to do another consult? (Y / N) ?");
			
			value = scan.next().charAt(0);
		} while (value != 'N');
		

		System.out.printf("\nEnd");
	}

}
