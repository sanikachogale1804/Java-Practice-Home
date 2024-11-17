package Inheritance;

public class Circle extends Shape{

	double radius;
	
	Circle(String color,Double radius)
	{
	     this.radius=radius;
	}

	double calculateArea()
	{
		return radius*radius;
	}
}
