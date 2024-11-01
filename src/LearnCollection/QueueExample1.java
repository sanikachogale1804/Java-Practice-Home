package LearnCollection;

import java.util.PriorityQueue;

public class QueueExample1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
		for(int i=1;i<=20;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		System.out.println("==================================");
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
	}
	
}
