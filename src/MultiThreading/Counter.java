package MultiThreading;

public class Counter {

	int count=0;
	
	synchronized void increment()
	{
		this.count++;
	}
	
}
