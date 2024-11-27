package LearnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
         
		List<Integer> numbers=Arrays.asList(78,98,35,76,13);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		
	}

}
