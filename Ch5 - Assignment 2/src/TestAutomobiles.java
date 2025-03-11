//Tripp 2/19 - Ch.5 Assignment 2
import java.util.Scanner;
public class TestAutomobiles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
//Car 1	
		System.out.print("Please provide the ID number, make, model, color, year, and miles per gallon of car 1. ");
		int idNum1 = input.nextInt();
		String make1 = input.next();
		String model1 = input.next();
		String color1 = input.next();
		int year1 = input.nextInt();
		int mpg1 = input.nextInt();
		Automobile car1 = new Automobile();
		car1.setIdNum(idNum1);
		car1.setMake(make1);
		car1.setModel(model1);
		car1.setColor(color1);
		car1.setYear(year1);
		car1.setMpg(mpg1);
		
//Car 2
		System.out.print("Please provide the ID number, make, model, color, year, and miles per gallon of car 2. ");
		int idNum2 = input.nextInt();
		String make2 = input.next();
		String model2 = input.next();
		String color2 = input.next();
		int year2 = input.nextInt();
		int mpg2 = input.nextInt();
		Automobile car2 = new Automobile();
		car2.setIdNum(idNum2);
		car2.setMake(make2);
		car2.setModel(model2);
		car2.setColor(color2);
		car2.setYear(year2);
		car2.setMpg(mpg2);
		
//Car 3
		System.out.print("Please provide the ID number, make, model, color, year, and miles per gallon of car 3. ");
		int idNum3 = input.nextInt();
		String make3 = input.next();
		String model3 = input.next();
		String color3 = input.next();
		int year3 = input.nextInt();
		int mpg3 = input.nextInt();
		Automobile car3 = new Automobile();
		car3.setIdNum(idNum3);
		car3.setMake(make3);
		car3.setModel(model3);
		car3.setColor(color3);
		car3.setYear(year3);
		car3.setMpg(mpg3);
		
//Not necessary		Automobile car= new Automobile();
		printOut(car1);
		printOut(car2);
		printOut(car3);

	}
	
	private static void printOut(Automobile car) {
		System.out.println("ID Number: "+car.getIdNum());
		System.out.println("Make: "+car.getMake());
		System.out.println("Model: "+car.getModel());
		System.out.println("Color: "+car.getColor());
		System.out.println("Year: "+car.getYear());
		System.out.println("Miles Per Gallon: "+car.getMpg());
		System.out.println("---------------------------------");
		
	}

}
