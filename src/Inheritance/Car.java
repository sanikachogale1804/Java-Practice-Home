package Inheritance;

public class Car extends Vehicle{

	String FuelType;
	
	Car(String make,String model,String FuelType)
	{
		this.make=make;
		this.model=model;
		this.FuelType=FuelType;
	}
	
	public void startEngine()
	{
		System.out.println("starting the vehicles engine");
	}
	
}

