//Tripp 2/19 - Ch.5 Assignment 1

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int int1;
		int int2;
		int int3;
		int firstNum;
		int secondNum;
		int thirdNum;
		
		Scanner integers = new Scanner(System.in);
		System.out.print("Input three integers to be sorted in ascending and descending order: ");
		int1 = integers.nextInt();
		int2 = integers.nextInt();
		int3 = integers.nextInt();
		
		if(int1 > int2 && int1 > int3){
			firstNum = int1;
			if(int2 > int3){
				secondNum = int2;
				thirdNum = int3;
				System.out.println("Here are your numbers in ascending order: "+thirdNum+", "+secondNum+", "+firstNum);
				System.out.println("Here are your numbers in descending order: "+firstNum+", "+secondNum+", "+thirdNum);
			}
			else {
				secondNum = int3;
				thirdNum = int2;
				System.out.println("Here are your numbers in ascending order: "+thirdNum+", "+secondNum+", "+firstNum);
				System.out.println("Here are your numbers in descending order: "+firstNum+", "+secondNum+", "+thirdNum);
			}
		}
		if(int2 > int1 && int2 > int3){
			firstNum = int2;
			if(int1 > int3){
				secondNum = int1;
				thirdNum = int3;
				System.out.println("Here are your numbers in ascending order: "+thirdNum+", "+secondNum+", "+firstNum);
				System.out.println("Here are your numbers in descending order: "+firstNum+", "+secondNum+", "+thirdNum);
			}
			else {
				secondNum = int3;
				thirdNum = int1;
				System.out.println("Here are your numbers in ascending order: "+thirdNum+", "+secondNum+", "+firstNum);
				System.out.println("Here are your numbers in descending order: "+firstNum+", "+secondNum+", "+thirdNum);
			}
		}
		if(int3 > int1 && int3 > int2){
			firstNum = int3;
			if(int1 > int2){
				secondNum = int1;
				thirdNum = int2;
				System.out.println("Here are your numbers in ascending order: "+thirdNum+", "+secondNum+", "+firstNum);
				System.out.println("Here are your numbers in descending order: "+firstNum+", "+secondNum+", "+thirdNum);
			}
			else {
				secondNum = int2;
				thirdNum = int1;
				System.out.println("Here are your numbers in ascending order: "+thirdNum+", "+secondNum+", "+firstNum);
				System.out.println("Here are your numbers in descending order: "+firstNum+", "+secondNum+", "+thirdNum);
			}
		}
		
	}

}
