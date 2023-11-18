
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int number1;
		int number2;
		
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		if (number1 > number2 ) {
			if ((number1 % number2) == 0) {
				System.out.println("This number is multiple");
			} else {
				System.out.println("This number isn't multiple");
			}
		} else {
			if ((number2 % number1) == 0) {
				System.out.println("This number is multiple");
			} else {
				System.out.println("This number isn't multiple");
			}
		}
		
	}

}
