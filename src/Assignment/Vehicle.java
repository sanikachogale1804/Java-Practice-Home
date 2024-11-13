package Assignment;

public class Vehicle {

	String name;
	int price;
	
	void start()
	{
		System.out.println("vehicle start");
	}
}

interface movable
{
	void move();
}

interface Flyable
{
	void fly();
}