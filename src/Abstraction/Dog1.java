package Abstraction;

public class Dog1 implements Animal1,Runnable
{

	public void sound()
	{
		System.out.println("Dog sound: bho-bho");
	}
	
	public void run()
	{
		System.out.println("Dog can run");
	}
	
}
