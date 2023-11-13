
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number;
		int hours;
		double value;
		double result;
		
		number= scan.nextInt();
		hours= scan.nextInt();
		value = scan.nextDouble();
		result = value * hours;
		
		System.out.println("The number is: " + number);
		System.out.println("The wage is U$: " + result);

		
		scan.close();
	}

}
