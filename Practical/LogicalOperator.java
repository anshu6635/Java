package CoreJava;
import java.util.Scanner;

public class LogicalOperator {
	
	public static void main(String args[])
	{
	//Creating Scanner Object
	Scanner sc = new Scanner(System.in);
	
	//taking input from the user
	System.out.println("Enter the first number");
	int num1= sc.nextInt();
	System.out.println("Enter the second number");
	int num2 = sc.nextInt();
	System.out.println("Enter the third number");
	int num3 = sc.nextInt();
	

	
	//using logical And to verify two constraint's
	System.out.println("Performing and operator");
	if((num1<num2) && (num2 == num3))
	{
		int sum = num1 + num2 + num3;
		System.out.println("The Sum of Given three number"+sum);
		
	}
	else
	{
		System.out.println("Condition is false");
		
	}
	//using OR operator
	System.out.println("Performing OR operation");
	
	if((num1<num2) || (num2 == num3))
	{
		int sum = num1 + num2 + num3;
		System.out.println("The Sum of Given three number"+sum);
		
	}
	else
	{
		System.out.println("Condition is false");
		
	}
	System.out.println("Performing NOT operation");
	
	//Using NOT Operator
	
	System.out.println("!(num1<num2)="+!(num1<num2));
	System.out.println("!(num2>num3)="+!(num2>num3));
	
	
	
	
	
}	
	

}
