package CoreJava;
/*
 Question2:WAP to find reverse of a number
 @author: Anshu kumar
 Date:Oct,6 2022
 */

import java.util.Scanner;

public class ReverseOfNum {
	//Creating Main Method
	public static void main(String args[]) 
	{
		//Creating Scanner class Object
		Scanner sc = new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter any number for REVERSE");
		 int n = sc.nextInt();
		 //Applying while loop
		 int n1 = 0;
		 while(n>0)
		 {
			 int r = n%10;
			  n= n/10;
			  n1 = n1*10+r;
		 }
		 
		 System.out.println("Reverse :"+n1);
		 
		 
	}
	

}
