package CoreJava;
/*Question4:WAP to check the condition for checking the correct password using If-Else.Take input from the user.
@author: Anshu kumar
Date: 6 ,oct
 */
import java.util.Scanner;

public class Password {
	//Creating main method
	public static void main(String arg[])
	{  
		//for user name and password
		String username;
		int password;
		
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//to get the user name
		System.out.println("Enter UserName");
		username = sc.nextLine();
		
		//to get the password
		System.out.println("Enter Password");
		password = sc.nextInt();
		
		System.out.println(password);
		// Condition for Checking the Correct password
		if (password == 12345)
		{
			System.out.println(username+" Congratulation buddy Login Succesful");
		}
		else
		{	
			System.out.println(username+"Oops!Login Denied");
			
		}
		
		
		
		
	}

}
