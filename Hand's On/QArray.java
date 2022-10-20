package CoreJava;
/*
 Q:- Program to input 10 numbers in an array and display only the even number if present in the array
 @Author:-Anshu kumar
 Date:-wed,Oct 19
 
 */

import java.util.Scanner;

public class QArray 
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
		
		for (int i = 0; i<a.length;i++)
		{// LOGIC for even element's
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		
		

	}

}
