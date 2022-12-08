package entities;

public class rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width * 2) + (height * 2);
	}

	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

	public String toString() {
		return "Area = " 
	+ String.format("%.2f%n", area()) 
	+ "perimeter = " + String.format("%.2f%n", perimeter())
	+ "Diagonal = " + String.format("%.2f", diagonal());

	}
}
