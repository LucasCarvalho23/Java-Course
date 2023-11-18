
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number01;
		
		number01 = scan.nextInt();
		
		if (number01 <= 25 && number01 > 0) {
			System.out.println("This number is within the range of 1-25");
		} else if (number01 == 0) {
			System.out.println("This number isn't positive or negative. It's neutral.");
		}
		else if (number01 >= 25 && number01 <= 50) {
			System.out.println("This number is within the range of 26-50");
		} else if (number01 > 50 && number01 <= 75) {
			System.out.println("This number is within the range of 51-75");
		} else if (number01 > 75 && number01 <= 100) {
			System.out.println("This number is within the range of 76-100");
		} else if (number01 < 0) {
			System.out.println("This number is negative");
		} else {
			System.out.println("This number is above 100");
		}
		
	}

}
