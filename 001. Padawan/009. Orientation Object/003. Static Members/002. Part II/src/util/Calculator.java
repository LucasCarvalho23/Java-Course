package util;

public class Calculator {
	
	public final double PI = Math.PI;
	
	public double circumference (double radius) {
		return 2 * PI * radius;
	}
	
	public double volume (double radius) {
		return ((double)4/3) * PI * (radius * radius * radius);
	}

}
