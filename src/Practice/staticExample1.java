package Practice;

class Counter
{
	static int count;
	
	Counter()
	{
		count++;
		System.out.println("Count: "+count);
	}
}

public class staticExample1 {
	
	public static void main(String[] args) {
		
//		Counter counter = new Counter();
//		new Counter();
//		new Counter();
		
		for(int i=1;i<=100;i++)
		{
			new Counter();
		}
	}

}
