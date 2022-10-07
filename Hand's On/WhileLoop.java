package CoreJava;

import java.util.Scanner;

/*
  WAP to demonstrate while loop continues 
until entered number is positive.Take the input from the user
@author: Anshu Kumar
Date : 7 oct, 2022
 */
public class WhileLoop 
{
    //Creating Main Method
	public static void main(String[] args)
	{//Creating Object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		
		
		while(num1>=0)
		{	
			System.out.println(num1);
			
			num1--;
		}
		
		

	}

}
