package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example8 {
	
	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(12,79,67,45,98,34);
		List<Integer> numbers = Arrays.asList();
		Optional<Integer> first = numbers.stream().findFirst();
		System.out.println(first);
//		
//		Integer integer = first.get();
//		System.out.println(integer);
		
		Integer orElseThrow = first.orElseThrow(()->new ArithmeticException("list is empty"));
		System.out.println(orElseThrow);
		
	}

}
