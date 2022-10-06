package CoreJava;
/*
 Q:WAP to check leap year
 @author : Anshu Kumar
 Date: Oct 6, 2022
 */
import java.util.Scanner;

public class LeapYear {
	//Main Method
	public static void main(String args[])
	{
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		//taking input from the user 
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		
		//variable to take a non-leap year by default
		boolean IsLeapYear = false;
		
		//Appplying leap year condition
		//If year is divisible by 4
		if (year % 4 == 0)
			
		{
			IsLeapYear = true;
			//To identify whether it 
			//is century year or not
			if (year %100==0) 
			{
			  //Checking if year is divisible by 400 for century leap year
				if(year%400==0)
				{	
					IsLeapYear = true;
				}
				else
				{	
					IsLeapYear = false;
				}
			}
			//if year is not divisible by 4
			else
			{	
				IsLeapYear = false;
			}
		}
			if (!IsLeapYear)
			{
				System.out.println(year + " : Not a Leap Year");
			}
			else
			{	
				System.out.println(year+" : Is Leap-Year");
			}
				
        
	
	

}
}
