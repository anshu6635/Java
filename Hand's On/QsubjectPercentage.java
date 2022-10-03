package CoreJava;
/*WAP to demonstrate nested if statement of 5 subjects.the person who gets above 60% will be passed otherwise failed.output should be like:Enter your name,Enter marks for the 5 subjects.
 
 @author :-Anshu kumar
 Date:- OCT 3, 2022
 */

import java.util.Scanner;

public class QsubjectPercentage {
	public static void main(String args[])
	{
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.println("Enter the number of 1st subject:");
		int sub1 = sc.nextInt();
		System.out.println("Enter the number of 2nd subject:");
		int sub2 = sc.nextInt();
		System.out.println("Enter the number of 3rd subject:");
		int sub3 = sc.nextInt();
		System.out.println("Enter the number of 4th subject:");
		int sub4 = sc.nextInt();
		System.out.println("Enter the number of 5th subject:");
		int sub5 = sc.nextInt();
		
		//calculating percentage
		float perc = ((sub1+sub2+sub3+sub4+sub5)/5)*100;
		
		//Applying given Condition
		if(perc>60)
		{
			System.out.println("Congratulation! You are pass");
		}
		else
		{
			System.out.println("Oops! You are Fail");
		}
	}

}
