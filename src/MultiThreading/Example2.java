package MultiThreading;

class T3 extends Thread
{
	public void run() {
	for(int i=1;i<=10;i++)
	{
		System.out.println("*");
	}
	}
}


public class Example2 {
	
	public static void main(String[] args) {
		
		T3 t=new T3();
		t.start();
		
	}

}
