package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example5 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,79,67,34,90,13);
	    Function<Integer, Integer> squareFunction=(n)->n*n;
		List<Integer> square = numbers.stream().map(squareFunction).collect(Collectors.toList());
		System.out.println(square);
		
		
	}

}
