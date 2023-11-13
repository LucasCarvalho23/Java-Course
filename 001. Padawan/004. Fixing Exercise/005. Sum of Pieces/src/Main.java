
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int CodProd;
		int numPiece;
		double value;
		int CodProd2;
		int numPiece2;
		double value2;
		double result;

		CodProd = scan.nextInt();
		numPiece = scan.nextInt();
		value = scan.nextDouble();
		CodProd2 = scan.nextInt();
		numPiece2 = scan.nextInt();
		value2 = scan.nextDouble();
		result = (value * numPiece) + (value2 * numPiece2);
		
		System.out.printf("Amount payable is U$: %.2f", result);
		
		scan.close();
	}

}
