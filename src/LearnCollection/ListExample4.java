package LearnCollection;

import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample4 {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("sanika");
		list.add("riya");
		list.add("akshata");
		list.add("tushar");
		System.out.println(list);
		
		Predicate<String> n=(name)->name.startsWith("a");
		list.removeIf(n);
		System.out.println(list);
	}

}
