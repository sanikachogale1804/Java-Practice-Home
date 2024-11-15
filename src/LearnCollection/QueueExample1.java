package LearnCollection;

import java.util.PriorityQueue;

public class QueueExample1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
//		queue.add(40);
//		queue.add(20);
//		queue.add(10);
//		queue.add(2);
//		queue.add(60);
//		
//		System.out.println(queue);
		
	   for(int i=1;i<=20;i++)
	   {
		   queue.add(i);
	   }
		System.out.println(queue);
		
		System.out.println("===============================");
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	
}
