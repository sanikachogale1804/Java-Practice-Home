package LearnCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListExample6 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(78);
		list.add(10);
		list.add(50);
		list.add(98);
		
		System.out.println(list);
		
		Iterator<Integer> iterator = list.iterator();
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		try
//		{
//			System.out.println(iterator.next());
//		}
//		catch(NoSuchElementException e)
//		{
//			System.out.println("No elements");
//		}
//		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
}
