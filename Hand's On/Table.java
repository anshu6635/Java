package CoreJava;

import java.util.Scanner;

/*WAP to print table of any number using for loop and take the input from the user.
 @uthor: Anshu kumar
 Date : 7 OCT, 2022
 */

public class Table {
    //Creating MAIN method
	public static void main(String[] args)
	{//Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//input from the user
		System.out.println("Enter a Number");
		int num1 = sc.nextInt();
		
		// Applying for LOOP
		for(int i =1; i<=10;i++)
		{	
			System.out.println(num1 +" X "+i +" = "+(num1*i));
		}
		

	}

}
