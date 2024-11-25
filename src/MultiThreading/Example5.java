 package MultiThreading;

 class Thread1 implements Runnable
 {

	@Override
	public void run() {
		System.out.println("Thread 1");
		
	}
	 
	 
 }
 
public class Example5 {
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Thread1());
		t1.start();
		
		
	
	}

}
