package LearnCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(56);
		list.add(60);
		list.add(45);
		list.add(null);
        System.out.println(list);
		System.out.println("===================");
		
		list.add(0,34);
		System.out.println(list);
		
		System.out.println(list.get(2));
	}

}
