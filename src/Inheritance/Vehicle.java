package Inheritance;

public class Vehicle {

	String make;
	String model;
	
	Vehicle()
	{
		
	}
	
	public Vehicle(String make,String model)
	{
		this.make=make;
		this.model=model;
	}
	
	public void startEngine()
	{
		System.out.println("starting the vehicles engine");
	}
	
}
