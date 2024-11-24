package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example9 {
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(12,79,56,90,63,39);
		
		numbers.stream().filter((n)->n%2==0).forEach((n)->System.out.println(n));
		
	}

}
