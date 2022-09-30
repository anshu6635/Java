package CoreJava;
/*Ques2. Create a program to find largest of two numbers.
@author :- Anshu Kumar
Date    :- Thursday,sep 29
*/
import java.util.Scanner;
 class LargestAmong2No {
	//Creating main function
	public static void main(String args[])
	{
		//Creating object of Scanner class
		Scanner sc =  new Scanner(System.in);
		
		//Taking input from the user
		System.out.println("Enter a first number");
		int num1 =sc.nextInt();
		System.out.println("Enter a second number");
		int num2 =sc.nextInt();
		
		//Performing Given Operation in Question
		if (num1>num2)
		{
			System.out.println("num1 is Greater that is:"+num1);
		}
		else 
		{
			System.out.println("num2 is Greater that is: "+num2);
		}
			
			
	}
	

}
