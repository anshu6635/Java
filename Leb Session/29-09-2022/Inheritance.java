package CoreJava;
//In this class i am inheriting child class that has also the property of parent class
//bcz of this it hase a MULTI LEVEL inheritence

public class Inheritance extends child
{
     //Creating main function
	public static void main(String args[])
	{
		//Creating object of the class
		Inheritance ob = new Inheritance();
		
		//Callig all the method's using object of Inheritance
		ob.sing();
		ob.dance();
		ob.speak();
	}
}
