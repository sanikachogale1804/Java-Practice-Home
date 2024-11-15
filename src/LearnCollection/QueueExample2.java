package LearnCollection;

import java.util.PriorityQueue;

public class QueueExample2 {
	
	public static void main(String[] args) {
		PriorityQueue<Product> queue=new PriorityQueue<Product>((p1,p2)->p2.getprice()-p1.getprice());
		
		queue.add(new Product(101,"mobile",50000));
		queue.add(new Product(102,"laptop",70000));
		
		System.out.println(queue);
		System.out.println(queue.peek());
	}

}
