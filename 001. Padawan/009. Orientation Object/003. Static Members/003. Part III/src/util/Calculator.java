package util;

public class Calculator {
	
	public static final double PI = Math.PI;
	
	public static double circumference (double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume (double radius) {
		return ((double)4/3) * PI * (radius * radius * radius);
	}

}
