package CoreJava;
/*Program: Check whether the charecter is "vowel","Consonent",Number,Special charector
@author :- Anshu Kumar
Date    :- Thursday,sep 29
 */
import java.util.Scanner;
class CheckCharecter
{
	 //calling main method
	 public static void main(String args[]) 
	 {
		 int i =0;
		 //creating scanner object
		 Scanner sc = new Scanner(System.in);
		 
		 //Taking charector input from the user
		 System.out.println("Enter a charecter");
		 char ch = sc.next().charAt(0);
		 //char ch = sc.nextChar();
		 switch(ch)
		 {
		 case 'a'  :
		 case 'e'  :
		 case 'i'  :
		 case 'o'  :
		 case 'u'  :
		 case 'A' :
		 case 'E'  :
		 case 'I'  :
		 case 'O'  :
		 case 'U'  :i++;	 
			 
		 }
		 if(i==1)
		 {
			 System.out.println("Entered character "+ch+" is  Vowel");
		 } 
		else 
		{
			
			 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) 
			 {
			    System.out.println("Entered character "+ch+" is Consonent");
			 }
			else 
			{
			     System.out.println("Not an alphabet");	
			}
		}
		
		 //checking for DIGIT
		 if(ch >=48 && ch<=57)
		 {
			 System.out.println("Entered charecter "+ch+" is Digit");
		 }
		
		
		 
		 
	  }

}
