package LearnCollection;

import java.util.Iterator;
import java.util.LinkedList;

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
		System.out.println(iterator.next());
	}
	
}
