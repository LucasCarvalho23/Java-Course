
/**
 * 
 */

import java.util.Scanner;

import util.CurrencyConverter;

 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's the dollar price?");
		double dollarPrice; 
		dollarPrice = scan.nextDouble();	
		
		System.out.println("How many dollars will be bought?");
		double dollarValue;
		dollarValue = scan.nextDouble();	
		
		double total = CurrencyConverter.reais(dollarPrice, dollarValue);
		
		System.out.printf("Dollar price: $ %.2f\n", dollarPrice);
		System.out.printf("Dollar value: $ %.2f\n", dollarValue);
		System.out.printf("Reais value: R$ %.2f\n", total);
	}
	

}
