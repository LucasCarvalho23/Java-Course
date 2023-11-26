package entities;

public class Student {

	public String name;
	public double note01;
	public double note02;
	public double note03;
	public double average;
	
	public double average() {
		average = (note01 + note02 + note03) / 3;
		return average;
	}
	
	public void finalGrade() {
		if (average >= 70) {
			System.out.println("You pass");
		} else {
			double total = 70 - average;
			System.out.printf("You missing %.2f points", total);
		}
	}
	
}
