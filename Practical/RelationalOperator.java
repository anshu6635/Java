package CoreJava;

import java.util.Scanner;

public class RelationalOperator {
	
	public static void main(String args[]) {
		//Creating Scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Getting input from the user
		
		System.out.println("Enter the first Number:-");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number:-");
		int num2 = sc.nextInt();
		
		//Performing Equal to Operation
		System.out.println("num1 == num2: "+(num1==num2));
		
		//Performing is not equal to operation
		System.out.println("num1 != num2: "+(num1!=num2));
		
		//performing greater than Symbol
		System.out.println("num1 > num2: "+(num1>num2));
		
		//performing less than Symbol
		System.out.println("num1 < num2: "+(num1<num2));
		
		//performing greater than equal to
		System.out.println("num1 >= num2: "+(num1>=num2));
		
		//performing less than equal to
		System.out.println("num1 <= num2: "+(num1<=num2));
		
		
		
		
		
		
	
	}

}
