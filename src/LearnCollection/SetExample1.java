package LearnCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetExample1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(30);
		hashset.add(90);
		hashset.add(10);
		hashset.add(89);
		hashset.add(900);
		hashset.add(5);
		System.out.println(hashset);
		
		List<Integer> list = Arrays.asList(67,90,56,13,1,60,4);
		System.out.println(list);
		
		HashSet<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
		
		
	}
	
}
