package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class xample2 {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(12,89,67,233,79);
		asList.stream().filter((n)->n>20).forEach((n)->System.out.println(n));
		System.out.println("============================================");
		
	    List<Integer> numbers = asList.stream().filter(n->n>20).collect(Collectors.toList());
		System.out.println(numbers);
		
		
	}
	
}
