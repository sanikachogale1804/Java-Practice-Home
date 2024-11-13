package Assignment;

public class Aeroplane extends Vehicle implements movable,Flyable
{

	String aeroName;
	
	void start()
	{
		System.out.println("Vehicle start");
	}

	@Override
	public void fly() {
		System.out.println("fly");
		
	}

	@Override
	public void move() {
		System.out.println("move");
		
	}
	
}
