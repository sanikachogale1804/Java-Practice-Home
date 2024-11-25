package MultiThreading;

class T3 extends Thread
{
	public void run() {
	for(int i=1;i<=10;i++)
	{
		System.out.println("*");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class T4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("$");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Example2 {
	
	public static void main(String[] args) {
		
		T3 t=new T3();
		t.start();
		
		T4 t4=new T4();
		t4.start();
		
	}

}
