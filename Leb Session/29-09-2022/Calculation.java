package CoreJava;
/*Ques3:Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
@author :- Anshu Kumar
Date    :- Thursday,sep 29
*/
import java.util.Scanner;
 class Calculation 
 {
	//Creating main method
	 public static void main(String args[])
	 {
		 //creating object of scannner class
		 Scanner sc = new Scanner(System.in);
		 
		 //taing input from the user
		 System.out.println("Enter the first number");
		 int num1 = sc.nextInt();
		 System.out.println("Enter the second number");
		 int num2 = sc.nextInt();
		 
		 //Creating Option for the user for the operation
		 System.out.print("Press 1 for Addition\nPress 2 for Substraction\nPress 3 for Multiplication\nPress 4 for Divison\n");
		 int cal = sc.nextInt();
		 
		 
		 if(cal==1) 
		 {
			 
			 System.out.println("Addition is:"+ (num1+num2));
		 }
		 else if(cal==2)
		 {
			 System.out.println("Substraction is:"+ (num1-num2));
		 }
		 else if(cal==3) 
		 {
			 System.out.println("Multiplication is:"+(num1*num2));
		 }
		 else if(cal==4)
		 {
			 System.out.println("Division is:"+(num1/num2));
		 }
		 else
		 {
			 System.out.println("Press a valid Option!");
		 }
			 
		 
	 }
	
	
//End
}
