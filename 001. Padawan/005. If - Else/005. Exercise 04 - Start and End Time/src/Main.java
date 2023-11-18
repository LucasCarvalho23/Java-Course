
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int hour1;
		int hour2;
		int total;
		
		hour1 = scan.nextInt();
		hour2 = scan.nextInt();
		
		if ((hour1 + hour2 >= 24) || (hour1 + hour2 < 1)) {
			System.out.println("Error.");
		} else {
			
			if (hour1 < hour2) {
				total = hour2 - hour1;
				System.out.printf("the game lasted %d hours.", total);
			} else {
				total = (hour2 - hour1) + 24;
				System.out.printf("the game lasted %d hours.", total);
			}
					
			
		}
		
	}

}
