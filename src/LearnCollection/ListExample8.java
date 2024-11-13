package LearnCollection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample8 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(90);
		list.add(45);
		list.add(86);
		System.out.println(list);
		Iterator<Integer> iterator=list.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		while(iterator.hasNext())
		{
			
		}
	}

}
