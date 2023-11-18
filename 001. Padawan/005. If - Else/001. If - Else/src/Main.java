
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int hour = 20;
		
		if (hour <= 12) {
			System.out.println("Morning!");
		} else if (hour > 12 && hour <= 18) {
			System.out.println("Good Afternoon!");
		} else {
			System.out.println("Good everning!");
		}
		
	}

}
