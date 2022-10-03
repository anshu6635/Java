package CoreJava;
/* Question:-WAP to test whether the person is applicable to give vote usinf If-Else

@author : Anshu  kumar
Date :-Oct 3,2022
*/
import java.util.Scanner;

public class Qvote {
	
	public static void main(String args[])
	{  
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking Input from the user
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Yes! You are eligible for vote");
			
		}
		else
		{
			System.out.println("NO! You are not eligible for vote");
		}
	}

}
