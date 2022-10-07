package CoreJava;

import java.util.Scanner;

/*WAP to demonstrate on switch case using input from the user.
 @author :Anshu kumar
 Date: 7 oct,2022
 */

public class SwitchCase {
	//Creating Main Method
	public static void main(String args[])
	{
		//Creating Object of Scanner Class
		Scanner sc = new Scanner(System.in);
		
		//Taing Input from the User 
		System.out.println("Enter first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Select the Option\nEnter 1 for ADDITION\nEnter 2 for SUBSTRACTION\nEnter 3 for MULTIPLICATION\nEnter 4 for DIVISION");
		int option = sc.nextInt();
		
		//Switch case
		switch(option)
		{
		case 1 :
			System.out.println("Adition is :"+(num1+num2));
			break;
		case 2 :
			System.out.println("Substraction is :"+(num1-num2));
		    break;
		case 3:
			System.out.println("Multiplication is :"+(num1*num2));
		    break;
		case 4:
			System.out.println("Division is :"+(num2/num1));
			break;
		default:
			System.out.println("Choose an valid Option Thank You!");
		}
		
		
	}

}
