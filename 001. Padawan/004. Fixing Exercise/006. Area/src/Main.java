
/**
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double number1;
		double number2;
		double number3;
		double pi = 3.14159;
		double resultTriangle;
		double resultCircle;
		double resultTrapeze;
		double resultSquare;
		double resultRectangle;

		number1 = scan.nextDouble();
		number2 = scan.nextDouble();
		number3 = scan.nextDouble();
		
		resultTriangle = (number1 * number3) / 2; 
		resultCircle = (number3 * number3) * pi;
		resultTrapeze = (number1 + number2)/2 * number3;
		resultSquare = number2 * number2;
		resultRectangle = number1 * number2;
		
		System.out.printf("The area of ​​the triangle is: %.3f\n", resultTriangle);
		System.out.printf("The area of ​​the circle is: %.3f\n", resultCircle);
		System.out.printf("The area of ​​the trapeze is: %.3f\n", resultTrapeze);
		System.out.printf("The area of ​​the square is: %.3f\n", resultSquare);
		System.out.printf("The area of ​​the rectangle is: %.3f\n", resultRectangle);
		
		scan.close();
	}

}
