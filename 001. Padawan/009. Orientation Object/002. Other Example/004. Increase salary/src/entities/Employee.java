package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax; 
	public double percentage;
	public double total;
	
	public double netSalary() {
		Double total = grossSalary - tax;
		this.total = total;
		return total;
	}
	
	public double increaseSalary() {
		double percentageCalc = (grossSalary / 100) * percentage;
		double total = this.total + percentageCalc;
		return total;
	}
	
}
