package MultiThreading;

public class Example6 {

	public static void main(String[] args) {
		
		Runnable r1=()->System.out.println("Lambda with multithreading");
		Thread t1=new Thread(r1);
		t1.start();
		
		
	}
	
}
