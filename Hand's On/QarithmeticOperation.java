package CoreJava;

import java.util.Scanner;

//Que1)Arithemic operation with three variables(Take the input from the user)

public class QarithmeticOperation {
	
	public static void main(String args[]) {
		//Creating scanner object to tae input from the user
		Scanner sc = new Scanner(System.in);
		
		//Getting input values from the user
        System.out.println("Enter the value of first Number:-");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of second Number:-");
		int num2 = sc.nextInt();
		System.out.println("Enter the value of third Number:-");
		int num3 = sc.nextInt();
		
		//Writing Operation's
		
		int add,sub,mul,div,mod;
				
		add = num1 + num2 + num3;
		sub = num1 - num2 - num3;
		mul = num1 * num2 * num3;
		div = num1 / num2 / num3;
		mod = num1 % num2 % num3;
				
		//Getting result
		System.out.println("Addition is :-"+ add);
		System.out.println("Substraction is :-"+ sub);
		System.out.println("Multiplication is :-"+ mul);
		System.out.println("Division is :-"+ div);
		System.out.println("Modules is :-"+ mod);

			
		
		
		
	}

}
