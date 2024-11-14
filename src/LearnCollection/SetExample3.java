package LearnCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample3 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(30);
		set.add(2);
		set.add(90);
		set.add(45);
		set.add(90);
		System.out.println(set);
		
		Iterator<Integer> iterator=set.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
