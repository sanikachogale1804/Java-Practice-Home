package MultiThreading;


class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Sanika");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class T2 extends Thread{
	
	public void run()
	{
		
	}
	
}

public class Example1 {
	
	public static void main(String[] args) {
	
		T1 t=new T1();
		t.start();
		
		
		
	}

}
