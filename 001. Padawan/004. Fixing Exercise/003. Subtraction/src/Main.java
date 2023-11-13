
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number1;
		int number2;
		int number3;
		int number4;
		int sum1;
		int sum2;
		int result;
		
		number1= scan.nextInt();
		number2= scan.nextInt();
		number3= scan.nextInt();
		number4= scan.nextInt();
		
		sum1 = number1 * number2;
		sum2 = number3 * number4;
		result = sum1 - sum2;		
		
		System.out.println("the diference is: " + Math.abs(result));
		
		scan.close();
	}

}
