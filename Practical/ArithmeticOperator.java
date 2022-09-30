package CoreJava;

import java.util.Scanner;

public class ArithmeticOperator {
	
	public static void main(String arg[]) {
		//creating scanner object to take input from user
		Scanner sc =new Scanner(System.in);
		
		//Getting Input value from the user
		
		System.out.println("Enter first Number :-");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:-");
		int num2 = sc.nextInt();
		
		//Writing Operation's
		
		int add,sub,mul,div,mod;
		
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		//Getting result
		System.out.println("Addition is :-"+ add);
		System.out.println("Substraction is :-"+ sub);
		System.out.println("Multiplication is :-"+ mul);
		System.out.println("Division is :-"+ div);
		System.out.println("Modules is :-"+ mod);




		
		
		
		

	
	}

}
