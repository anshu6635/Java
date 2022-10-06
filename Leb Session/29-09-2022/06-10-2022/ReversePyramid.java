package CoreJava;
/*Question3:WAP to create ReversePyramid
 @author:Anshu Kumar
 Date:-6,Oct 2022

 */

public class ReversePyramid {
	//Creating main Method
	public static void main(String arg[])
	{
		//Size of pyramid
		int number =7;
		int i,j;
		for(i= 0 ; i<=number-1; i++)
		{
			//Inner LOOP FoR space
			for( j = 0; j<=i;j++)
			{
				System.out.print(" ");
			}
			//Inner loop print star
			for(int k=1;k<=number-1-i; k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
			
	}
	

}
