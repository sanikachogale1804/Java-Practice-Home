package MultiThreading;

class T5 extends Thread
{
	public void run()
	{
	while(true)
	{
		System.out.println("**********************");
	}
}
}
public class Example3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		T5 t5=new T5();
		t5.setDaemon(true);
		t5.start();
		
		Thread.sleep(1000);
		
	}

}
