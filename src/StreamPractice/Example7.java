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
		
		Optional<Integer> any = numbers.stream().findAny();
		System.out.println(any);
	}

}
