package LearnCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(56);
		list.add(60);
		list.add(45);
        System.out.println(list);
		System.out.println("===================");
		
//		list.add(0,34);
//		System.out.println(list);
//		
//		System.out.println(list.get(2));
//		System.out.println("===================");
//		Integer i = list.set(3, 30);
//		System.out.println(i);
//		System.out.println(list);
		
//		Predicate<Integer> even=(num)->num%2==0;
//		list.removeIf(even);
		
		list.removeIf((num)->num%2==0);
		System.out.println(list);
		
	}

}
