package FunctionalIntarface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InterfaceEx6 {
	
	public static void main(String[] args) {
		 
		
		   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		   long count = numbers.stream()
		                        .filter(n -> n % 2 == 0)  
		                        .count();  

		   System.out.println("Count of even numbers: " + count); 


		   int sum = numbers.stream()
		                    .reduce(0, (a, b) -> a + b);  

		        System.out.println("Sum of all numbers: " + sum);  
		    }
		

		}

		

		
	


