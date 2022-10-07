package CoreJava;

import java.util.Scanner;

/*WAP to print Reverse of numbers for example 10 9 8 7 6 5 4 3 2 1 using do-while loop and take the input from the user.
 @author : Anshu Kumar
 Date : 7 Oct, 2022
 */

public class DoWhileLoop 
{  //Creating Main Method
	public static void main(String args[])
	{
		//Creating the Object of Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking input as Per Question
		System.out.println("Enter a number ");
		int num1 = sc.nextInt();
	
//Applying Do while loop
		do
		{
			System.out.println(num1);
			num1--;
		}
		//Checking condition
		while(num1>0) ;
		
		
	}

}
