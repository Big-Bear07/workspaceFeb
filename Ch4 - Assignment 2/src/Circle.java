//Tripp 2/11 - Ch.4 Assignment 2
public class Circle {
	private double radius;
	private double diameter;
	private double area;
	public Circle() {
		this.radius = 1;
		this.diameter = 2*radius;
		this.area = Math.PI*Math.pow(radius,2);
	}

//Setter and Getters
	public void setRadius(double r) {
		radius = r;
		diameter = 2*radius;
		area = Math.PI*Math.pow(radius,2);
	}
	
	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
		return diameter;

	}

	public double getArea() {
		return area;

	}
	
}