//create a class Sum, with method sum with return type int and parameter int x and int y and return addition of the two integers.create a method Sum with return type int and parameter int x, int y,int z and return addition of three integers.create sum method with with return type double and with parameter double x,double y and return addition of two numbers.create object of class and pass the values by calling method and print the output.
package CoreJava;

 class Sum {
	//method's
	
	public int sum(int x,int y) //Local variable
	{
		return (x+y);
		
	}
	
	public int sum(int x, int y, int z)//local variable
	{
		
		return (x+y+z);
	}

	public double sum(double x,double y) //local variable
	{
		return (x+y);
		
	}
	
	public static void main(String args[]) {
		//creating object of sum class
		Sum s = new Sum();
		//calling method by overlaoding 
		System.out.println(s.sum(4, 5));
		System.out.println(s.sum(2.002, 4.0002));
		System.out.println(s.sum(6, 7, 8));
		
		
	}
}
