
/**
 * 
 */

import entities.Employee;
import java.util.Scanner;

 
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		
		employee.name = scan.nextLine();
		employee.grossSalary = scan.nextDouble();
		employee.tax = scan.nextDouble();

		
		System.out.println("Name: " + employee.name);
		System.out.println("Gross salary: " + String.format("%.2f", employee.grossSalary));
		System.out.println("Tax: " + String.format("%.2f", employee.tax));
		
		System.out.println();
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		
		System.out.println();
		System.out.println("What percentage to increase salary? ");
		employee.percentage = scan.nextDouble();
		
		System.out.println();
		System.out.println("Update data: " + employee.name + ", $ " + String.format("%.2f", employee.increaseSalary()));
		
	}
}
