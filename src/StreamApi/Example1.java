package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Example1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylist =new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			arraylist.add(i);
		}
		System.out.println(arraylist);
		
		Stream <Integer> stream=arraylist.stream();
		Consumer<Integer> c=(i)->System.out.println(i);
		stream.forEach(c);
		
		List<String> names=Arrays.asList("Sanika","sneha","akshata","tushar");
		Stream<String> stream2 = names.stream();
		Consumer<String> name=(n)->System.out.println(n.toUpperCase());
		stream2.forEach(name);
		
		
	}

}
