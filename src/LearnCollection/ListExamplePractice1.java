package LearnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(67);
		list.add(89);
		list.add(35);
		list.add(12);
		System.out.println(list);
		
		list.iterator();
		System.out.println(list);
		
	}

}
