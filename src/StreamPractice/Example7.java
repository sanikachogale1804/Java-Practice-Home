package StreamPractice;

import java.util.ArrayList;
import java.util.Optional;

public class Example7 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Optional<Integer> any = numbers.parallelStream().findAny();
		System.out.println(any);
		
		System.out.println("===================================");
		
		boolean anyMatch = numbers.stream().anyMatch((n)->n>10);
		System.out.println(anyMatch);
		
	    boolean allMatch = numbers.stream().allMatch((n)->n>10);
	    System.out.println(allMatch);
	    
		System.out.println("===================================");
		
		boolean anyMatch2 = numbers.stream().anyMatch((n)->n%2==0);
		System.out.println(anyMatch2);
		
		boolean allMatch2 = numbers.stream().allMatch((n)->n%2==0);
		System.out.println(allMatch2);
		
		System.out.println("===================================");
	    
	}

}
