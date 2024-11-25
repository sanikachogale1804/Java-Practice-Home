package MultiThreading;

public class Example6 {

	public static void main(String[] args) {
		
		Runnable r1=()->System.out.println("Lambda with multithreading");
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(()->System.out.println("lambda expression"));
		t2.start();
		
		Thread t3=new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("sanika");
			}
		});
		t3.start();
		
	}
	
}
