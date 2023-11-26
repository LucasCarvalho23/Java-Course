package entities;

public class Retangle {

	public Double width;
	public Double height;
	
	public double Area() {
		double area = width * height;
		return area;
	}
	
	public double Perimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	
	public Double Diagonal() {
		double diagonal = Math.sqrt((width * width) + (height * height));
		return diagonal;
	}
	
}
