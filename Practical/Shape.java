package CoreJava;

public interface Shape
{
 void getArea(int length , int breath);
}
//implement the shape Interface
class Rectangle implements Shape
{
	//Implementation of Abstract method of interface menthod
public void getArea(int length , int breath)
{
System.out.println("The area of rectengle is:"+(length*breath));
}
}
