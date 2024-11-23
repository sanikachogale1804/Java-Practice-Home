package StreamApi;

import java.util.ArrayList;

public class Example9 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		System.out.println("============================");
		
		numbers.parallelStream().forEach((num)->System.out.println(num));
		System.out.println("============================");
	}

}
