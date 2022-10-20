package CoreJava;
/*
Q:- WAP that create integer array of 10 element's accepts values of array of 10 element's accept values of array and find sum of all odd number
@Author:-Anshu kumar
Date:-wed,Oct 19

*/

import java.util.Scanner;

public class QArray2
{

	public static void main(String[] args)
	{//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		//Tking input from the user
		System.out.println("Enter the element's ");
		for (int i = 0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i<a.length;i++)
		{// LOGIC for even element's
			if(a[i]%2!=0)
			{
				sum = sum+a[i];
				
			}
		}
		
		System.out.println("Sum of all odd number is:"+sum);
		

	}

}
