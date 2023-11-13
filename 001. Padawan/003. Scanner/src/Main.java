
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name;
		int number;
		
		name = scan.nextLine();
		number = scan.nextInt();
		
		System.out.println("You type: " + name);
		System.out.println("You type: " + number);
		
		scan.close();
	}

}
