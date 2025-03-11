//Tripp 2/25 - Ch.6 Web Assist Assignment 1

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		int artPoints;
		int artBars = 0;
		int bobPoints;
		int bobBars = 0;
		int calPoints;
		int calBars = 0;
		int danPoints;
		int danBars = 0;
		int eliPoints;
		int eliBars = 0;
		Scanner points = new Scanner(System.in);
		
//Point Request
		System.out.print("How many points did Art score >> ");
		artPoints = points.nextInt();
		System.out.print("How many points did Bob score >> ");
		bobPoints = points.nextInt();
		System.out.print("How many points did Cal score >> ");
		calPoints = points.nextInt();
		System.out.print("How many points did Dan score >> ");
		danPoints = points.nextInt();
		System.out.print("How many points did Eli score >> ");
		eliPoints = points.nextInt();

//Bar Chart
		System.out.println("\nPoints for Game\n");
		
		System.out.print("Art  ");
		while(artBars < artPoints) {
			System.out.print("*");
			artBars++;
		}
		System.out.print("\nBob  ");
		while(bobBars < bobPoints) {
			System.out.print("*");
			bobBars++;
		}
		System.out.print("\nCal  ");
		while(calBars < calPoints) {
			System.out.print("*");
			calBars++;
		}
		System.out.print("\nDan  ");
		while(danBars < danPoints) {
			System.out.print("*");
			danBars++;
		}
		System.out.print("\nEli  ");
		while(eliBars < eliPoints) {
			System.out.print("*");
			eliBars++;
		}

	}

}
