
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String triangle = null;
		System.out.println("Enter the measures if triangle X: ");
		Double result01;
		String triangle01 = "x";
		result01 = receiveValue();
		
		System.out.println("Enter the measures if triangle Y: ");
		Double result02;
		String triangle02 = "y";
		result02 = receiveValue();
		
		showResult(triangle01, result01);
		showResult(triangle02, result02);
		triangle = testLarger(result01, result02);
		showLarger(triangle);
		
	}
	
	public static Double receiveValue() {
		Scanner scan = new Scanner(System.in);
		Double number01 = scan.nextDouble();
		Double number02 = scan.nextDouble();
		Double number03 = scan.nextDouble();
		Double result01 = (number01 + number02 + number03) / 2; 
		return result01;

	}
	
	public static void showResult(String triangle, Double result) {
		System.out.printf("Triangle %s area: %.2f\n", triangle, result);
	}
	
	public static String testLarger(Double result01, Double result02) {
		String triangle;
		if (result01 > result02) {
			triangle = "x";
			return triangle;
		} else {
			triangle = "y";
			return triangle;
		}
	}
	
	public static void showLarger(String triangle) {
		System.out.printf("Major larger area is %s", triangle);
	}
	


}
