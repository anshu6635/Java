package CoreJava;


public class Method_Overiding2 extends Method_Overiding{
	void display() {
		System.out.println("I am from sub class Method_Overiding2");
	}
	
	public static void main(String args[]) {
		//Maiking objects
		Method_Overiding2 m = new Method_Overiding2();
		
		// here it will over ride the supperclass and run the local class
		m.display();
		
		
	}

}
