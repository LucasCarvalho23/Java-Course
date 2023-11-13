
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number1;
		int number2;
		int sum;
		
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		sum = number1 + number2;
		
		System.out.println("the sum is: " + sum);
		
		scan.close();
	}

}
