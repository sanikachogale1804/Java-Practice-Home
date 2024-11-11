package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;



public class Example6 {
	
	public static void main(String[] args) {
		
//		List<Integer> numbers = Arrays.asList(1,8,4,9,3,6,7);
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a*b);
		System.out.println(reduce);
		
//		Integer integer = reduce.get();
//		System.out.println(integer);
		
		
		Integer i = reduce.orElseThrow(()->new RuntimeException("list is empty"));
		System.out.println(i);
	}

}
