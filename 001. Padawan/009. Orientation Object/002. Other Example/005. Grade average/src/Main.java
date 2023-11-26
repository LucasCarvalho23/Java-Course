
/**
 * 
 */

import entities.Student;
import java.util.Scanner;

 
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
		student.name = scan.nextLine();
		student.note01 = scan.nextDouble();
		student.note02 = scan.nextDouble();
		student.note03 = scan.nextDouble();
		
		System.out.println("Final grade: " + String.format("%.2f", student.average()));
		student.finalGrade();				
	}
}
