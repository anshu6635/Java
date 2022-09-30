//Question 2: create a abstract class car with default constructor and print car is built in that.create abstract void drive method,gearchange method and print gear changed in that method.

//Create another class Tesla which extends car and has void drive method with drive safely print.create an object of class and call drive and gearchange method.
package CoreJava;

abstract class Qcar {
	//method's
	abstract void drive();//abstract method
	public void gearchange() {
		System.out.println("GearChange.....");
	}
	
}

class Tesla extends Qcar
{
	public void drive() //body and definition of that abstract method of super class
	{
		System.out.println("Drive..Safely");
	}
	
	//Main Method
	
	public static void main(String args[]) {
		//creating object
		Tesla T = new Tesla();
		
		//calling method's
		
		T.drive();
		T.gearchange();
	}
}


