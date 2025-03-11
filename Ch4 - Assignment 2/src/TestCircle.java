//Tripp 2/11 - Ch.4 Assignment 2
import java.util.*;

public class TestCircle {	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the radius of your circle? ");
		double radius2 = input.nextDouble();
		Circle userCircle = new Circle();
		userCircle.setRadius(radius2);
		
		Circle radius1 = new Circle();
		printOut(radius1);
		printOut(userCircle);

	}
	
	private static void printOut(Circle radius1) {
		System.out.println("The radius is "+radius1.getRadius());
		System.out.println("The diameter is "+radius1.getDiameter());
		System.out.println("The area is "+radius1.getArea());
		System.out.println("---------------------------------");
		
	}
}
