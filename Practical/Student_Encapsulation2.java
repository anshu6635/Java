package CoreJava;

public class Student_Encapsulation2 extends Student_Encapsulation {
	
	public static void main(String args[]) {
		//creating object
		
		Student_Encapsulation s1 = new Student_Encapsulation();
		
		//setting values
		
		s1.setRollno(2);
		s1.setName("ANSHU");
		
		//Getting values
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		
		
	}

}
