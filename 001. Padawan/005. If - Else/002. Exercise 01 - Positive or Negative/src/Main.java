
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number;
		
		number = scan.nextInt();
		
		if (number >= 0) {
			System.out.println("This number is positive");
		} else {
			System.out.println("This number is negative");
		}
		
	}

}
