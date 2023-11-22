
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter with three number");
		int number01 = scan.nextInt();
		int number02 = scan.nextInt();
		int number03 = scan.nextInt();
			
		int higher = max(number01, number02, number03);
		
		showResult(higher);
		
		scan.close();
		
	}
	
	public static int max(int number01, int number02, int number03) {
		
		int aux;
		
		if (number01 > number02 && number01 > number03) {
			aux = number01;
		} else if (number02 > number03) {
			aux = number02;
		} else {
			aux = number03;
		}
		
		return aux;
	}
	
	public static void showResult(int higher) {
		System.out.printf("Higher is %d", higher);
	}

}
