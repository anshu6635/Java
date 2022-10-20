package CoreJava;

/*Q:Write the java program to find the second largest element in an array
 @uthor :Anshu Kumar
 Date:-Thrusday,Oct 20,2022
 
 */

import java.util.Arrays;
import java.util.Scanner;

class QsecondLargest
{
    //Main Method
	public static void main(String[] args) 
	{
		//Scanner Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		//Declaring Array
		int arr[] = new int[a];
		System.out.println("Enter the element's");
		for(int i = 0 ; i <arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//invoking sort method
		Arrays.sort(arr);
		System.out.println("Second largest Element is: "+arr[((arr.length)-2)]);
	

	}

}


