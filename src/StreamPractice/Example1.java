package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			 list.add(i);
		}
		System.out.println(list);
		
		list.stream().forEach((i)->System.out.println(i));
		
		List<String> list2 = Arrays.asList("sanika","riya","sneha","tushar","akshata");
		
		
	}

}
