package Abstraction;

abstract class Electronics
{
	abstract void start();
	abstract void stop();
}

class Tv extends Electronics
{
	void start()
	{
		System.out.println("Tv started:");
	}
	
	void stop()
	{
		System.out.println("Tv stopped:");
	}
}

class Ac extends Electronics
{
	void start()
	{
		System.out.println("Ac started:");
	}
	
	void stop()
	{
		System.out.println("Ac stopeed:");
	}
}

public class AbstractionEx1 {
	
	public static void main(String[] args) {
		
		new Tv().start();
		new Tv().stop();
		new Ac().start();
		new Ac().stop();
		
		Electronics Washingmachine = new Electronics() {
			void start()
			{
				System.out.println("Washing machine started:");
			}
			
		};
	}

}
