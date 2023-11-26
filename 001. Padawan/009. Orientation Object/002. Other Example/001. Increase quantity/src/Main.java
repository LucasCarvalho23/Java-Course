
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product data: ");
		System.out.println("What the name?");
		String name = scan.next();
		System.out.println("What the price?");
		Double price = scan.nextDouble();
		System.out.println("What the quantity in stock?");
		int quantity = scan.nextInt();
		Double total = quantity * price;
		
		System.out.printf("Product data: %s, %d unit. Total: $ %.2f", name, quantity, total);
		System.out.println("\nEnter the number of product to be added in stock: ");
		int newQuantity = scan.nextInt();
		quantity += newQuantity;
		total = quantity * price;
		System.out.printf("Update data: %s, %d unit. Total: $ %.2f", name, quantity, total);
		System.out.println("\nEnter the number of product to be removed in stock: ");
		newQuantity = scan.nextInt();
		quantity -= newQuantity;
		total = quantity * price;
		System.out.printf("Update data: %s, %d unit. Total: $ %.2f", name, quantity, total);
	}
}
