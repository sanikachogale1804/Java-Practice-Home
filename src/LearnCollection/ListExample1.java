package LearnCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(10);
		List.add(67);
		List.add(89);
		List.add(45);
		List.add(57);
		System.out.println(List);
		
		System.out.println("==============================");
		Collections.sort(List);
		for(Integer i:List)
		{
			System.out.println();
		}
		System.out.println(List);
		System.out.println("==============================");
		System.out.println(List.size());
		
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		List2.add(10);
		List2.add(67);
		List2.add(89);
		List.addAll(List2);
		System.out.println(List);
		
	}
	
}
