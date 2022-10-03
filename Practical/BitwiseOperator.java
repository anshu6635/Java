package CoreJava;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String arg[]) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number:");
       int num1 = sc.nextInt();
       System.out.println("Enter second number:");
       int num2 = sc.nextInt();
       
      //Bitwise AND OPERATOR
       System.out.println("num1&num2="+(num1 & num2));
       //0 1 0 1
       //0 1 1 0
       //.......
       //0 1 0 0 = 4
       
       //bitwise or operator
       System.out.println("num1&num2="+(num1 & num2));
       //0 1 0 1
       //0 1 1 0
       //.......
       //0 1 1 1 = 7
       
       //bitwise XOR
       System.out.println("num1^num2="+(num1^num2));
       //0 1 0 1
       //0 1 1 0
       //.......
       //0 0 1 1= 16
       
       //Bitwise NOT
       System.out.println("~num1"+ ~num1);
       //0 1 0 1
       
    }
}
