package Abstraction;

public interface Vehicle {

	void start();
	void stop();
	
	static void FeuelUp()
	{
		System.out.println("filling the vehicle with fuel");
	}
	
	default void displayInfo()
	{
		System.out.println("This is a vehicle");
	}
}

class car implements Vehicle
{
	public void start()
	{
		System.out.println("car started");
	}
	
	public void stop()
	{
		System.out.println("car stopped");
	}
}
