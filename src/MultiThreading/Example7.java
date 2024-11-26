package MultiThreading;

public class Example7 {
	
	public static void main(String[] args) {
		
	  Counter counter=new Counter();
		Thread t1=new Thread(()->{
			for(int i=1;i<=50000;i++)
			{
				counter.increment();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=50000;i++)
			{
				counter.increment();
			}
		});
		
		t1.start();
		t2.start();
	}

}
