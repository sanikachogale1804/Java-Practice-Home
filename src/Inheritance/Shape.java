package Inheritance;

public class Shape {
	
	String color;
	
	Shape() {
		
	}
	
	Shape(String color)
	{
		this.color=color;
	}

	void displayInfo()
	{
		System.out.println("shape class "+color);
	}
}
