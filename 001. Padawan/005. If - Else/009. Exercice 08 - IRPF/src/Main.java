
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double wage, total, total2, total3, total4, total5;
		
		wage = scan.nextDouble();
		
		if (wage <= 2000) {
			System.out.printf("You're exempt");
		} else if (wage > 2000 && wage <= 3000) {
			total = (wage * 8) / 100;
			System.out.printf("The total payable is %.2f", total);
		} else if (wage > 3001 && wage <= 4500) {
			total = wage - 3000;
			total2 = (1000.00 * 8) / 100;
			total3 = (total * 18) / 100;
			total4 = total3 + total2;
			System.out.printf("The total payable is %.2f", total4);
		} else if (wage > 4501) {
			total = wage - 4500;
			total2 = (1500.00 * 18) / 100;
			total3 = (total * 28) / 100;
			total4 = (1000.00 * 8) / 100;
			total5 = total3 + total2 + total4;
			System.out.printf("The total payable is %.2f", total5);
		}
		
	}

}
