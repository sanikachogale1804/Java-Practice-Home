package Inheritance;

public class Rectangle extends Shape{
	
	double length,width;
	
	Rectangle(String color,double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	
	double AreaOfRectangle()
	{
		return length*width;
	}

	
}
