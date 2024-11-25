package MultiThreading;

class T6 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("hello");
		}
	}
}

public class Example4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		T6 t6=new T6();
		t6.setDaemon(true);
		t6.start();
		
		Thread.sleep(500);
		
	}

}
