package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example6 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,89,67,35,82,39,56);
		Optional<Integer> reduce = list.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
		Integer integer = reduce.get();
		System.out.println(integer);
		
	}

}
