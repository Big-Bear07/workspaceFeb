//Tripp 2/11 - Ch.4 Assignment 1
public class MathAnswers {

	public static void main(String[] args) {
		double squareRoot = Math.sqrt(37);
		double sine = Math.sin(300);
		double cos = Math.cos(300);
		double ceiling = Math.ceil(22.8);
		double floor = Math.floor(22.8);
		double round = Math.round(22.8);
		double larger = Math.max('D',71);
		double smaller = Math.min('D',71);
		double random = (int) (Math.random()*20);
		
		System.out.println("The square root of 37 is "+squareRoot+"\n");
		System.out.println("The sine of 300 is "+sine);
		System.out.println("The cosine of 300 is "+cos+"\n");
		System.out.println("The ceiling of 22.8 is "+ceiling);
		System.out.println("The floor of 22.8 is "+floor);
		System.out.println("The 22.8 rounded is "+round+"\n");
		System.out.println("The larger between \"D\" and 71 is "+larger);
		System.out.println("The smaller between \"D\" and 71 is "+smaller+"\n");
		System.out.println("A random number between 0 and 20 is "+random);

	}

}
