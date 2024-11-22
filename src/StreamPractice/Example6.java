package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example6 {
	
	private static Integer integer;

	public static <E> void main(String[] args) {
//		
//		List<Integer> list = Arrays.asList(12,89,67,35,82,39,56);
//		Optional<Integer> reduce = list.stream().reduce((a,b)->a+b);
//		System.out.println(reduce);
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		Optional<Integer> reduce = list.stream().reduce((a,b)->a+b);
		System.out.println(reduce);


}
}
