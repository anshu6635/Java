//Question 3: create class Animal with method void eat and print I am a omnivorous.another class Mammal extend Animal with method void nature and prints I am a Mammal.another class Dog extends Mammal with method void sound and prints I bark.create a main method and object of class and call all the methods.
package CoreJava;

 class Qanimal {
	//method's
	public void eat()
	{
		
		System.out.println("I am omnivoruous");
	
	}

}

//2nd class
class Mammal extends Qanimal{
	public void nature() 
	{
		
		System.out.println("I am Mammel");
	
	}
}

//3rd class

class Dog1 extends Mammal{
	public void sound() 
	{
		
		System.out.println("I bark ...");
	
	}

	
	// Main METHOD
	
	public static void main(String args[]) {
		
		// CREATING OBJECT
		Dog1 D = new Dog1();
		
		// calling method's
		D.eat();
		D.nature();
		D.sound();
		
	}
}
