package CoreJava;
/*Q:-WAP to take an even no. as an input from the user using array and print those numbers.
 @author:Anshu Kumar
 Date:-Thrusday,Oct 20,2022
 
 */

import java.util.Scanner;

public class QInputEven
{
    //Main method
	public static void main(String[] args) 
	{
		//Creating O bject of Scanner class
		Scanner sc = new Scanner(System.in);
		int b;
		System.out.println("Enter the size of array");
		//Declaring array
		b = sc.nextInt();
		int a[] = new int[b];
		System.out.println("Enter even number");
		for(int i = 0; i<a.length;i++)
		{	
			int num = sc.nextInt();
			//Logic
			if(num%2==0)
			{
				a[i]=num;
			}
			else 
			{
				System.out.println("Sorry! Please Enter only Even Number");
			}
		}
		//Traversing array
		System.out.println("Elements of array that is even only are:");
		for(int i = 0; i <a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		

	}

}
