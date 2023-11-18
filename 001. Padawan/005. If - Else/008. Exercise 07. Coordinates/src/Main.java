
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double numberx, numbery;
		
		numberx = scan.nextDouble();
		numbery = scan.nextDouble();
		
		if (numberx > 0 && numbery > 0) {
			System.out.printf("Q1");
		} else if (numberx < 0 && numbery > 0) {
			System.out.printf("Q2");
		} else if (numberx < 0 && numbery < 0) {
			System.out.printf("Q3");
		} else if (numberx > 0 && numbery < 0) {
			System.out.printf("Q4");
		} else {
			System.out.printf("Origin");
		}
		
	}

}
