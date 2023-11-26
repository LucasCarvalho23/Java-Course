
/**
 * 
 */

import entities.Retangle;
import java.util.Locale;
import java.util.Scanner;

 
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Retangle rectangle = new Retangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		System.out.println("Área = " + String.format("%.2f", rectangle.Area()));
		System.out.println("Perímetro = " + String.format("%.2f", rectangle.Perimeter()));
		System.out.println("Diagonal = " + String.format("%.2f", rectangle.Diagonal()));
		
	}
}
