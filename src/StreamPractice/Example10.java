package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example10 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,79,67,34,90,13);
		
		List<Integer> multipyby10 = numbers.stream().map((n)->n*10).collect(Collectors.toList());
		System.out.println(multipyby10);
		
	}

}
