package CoreJava;
//Que)Relational Operations with two variables(Take the input from the User)
import java.util.Scanner;

public class QRelationalOperator {
	public static void main(String args[]) {
		//Creating Scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// Getting input from the user
		
		System.out.println("Enter the first Number:-");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number:-");
		int num2 = sc.nextInt();
		System.out.println("Enter the third Number:-");
		int num3 = sc.nextInt();
		
		//Performing Equal to Operation
		System.out.println("num1 == num2 and num1==num3 : "+(num1==num2) + (num1 == num3));
		
		//Performing is not equal to operatione
		System.out.println("num1 != num2 and num1 != num3: "+(num1!=num2) + (num1 != num3 ));
		
		//performing greater than Symbol
		System.out.println("num1 > num2 and num1 > num 3: "+(num1>num2) + (num1>num3));
		
		//performing less than Symbol
		System.out.println("num1 < num2 and num1 < num3: "+(num1<num2) + (num1<num3));
		
		//performing greater than equal to
		System.out.println("num1 >= num2 and num1 > num3: "+(num1>=num2) + (num1>=num3));
		
		//performing less than equal to
		System.out.println("num1 <= num2 and num1 <=num3: "+(num1<=num2) +(num1<=num3));
		
	}	

}
