
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int code;
		int amount;
		Double total;
		
		code = scan.nextInt();
		
		if (code == 1) {
			amount = scan.nextInt();
			total = amount * 4.0;
			System.out.printf("The total for the hot dog was R$%.2f\n", total);
		} else if (code == 2) {
			amount = scan.nextInt();
			total = amount * 4.5;
			System.out.printf("The total for the cheese-salad was R$%.2f\n", total);
		} else if (code == 3) {
			amount = scan.nextInt();
			total = amount * 5.0;
			System.out.printf("The total for the cheese-bacon was R$%.2f\n", total);
		} else if (code == 4) {
			amount = scan.nextInt();
			total = amount * 2.0;
			System.out.printf("The total for the toast was R$%.2f\n", total);
		} else if (code == 5) {
			amount = scan.nextInt();
			total = amount * 1.5;
			System.out.printf("The total for the soft drink was R$%.2f\n", total);
		} else {
			System.out.println("Error");
		}

		
	}

}
