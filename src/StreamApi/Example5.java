package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,89,67,35,67,59);
		Function<Integer, Integer> cube=(n)->n*n*n;
//		List<Integer> cubenumbers = numbers.stream().map(cube).collect(Collectors.toList());
//		System.out.println(cubenumbers);
		
		System.out.println(numbers.stream().map(cube).collect(Collectors.toList()));
		
	    List<Integer> collect = numbers.stream().map(n->n%2).collect(Collectors.toList());
	    System.out.println(collect);
		
		List<Integer> multiplyby10 = numbers.stream().map(n->n%10).collect(Collectors.toList());
		System.out.println(multiplyby10);
		
		List<String> names = Arrays.asList("sanika","riya","akshata","tushar");
	    List<Integer> collect2 = names.stream().map(n->n.length()-1).collect(Collectors.toList());
	    System.out.println(collect2);
	    
	    
	}

}
