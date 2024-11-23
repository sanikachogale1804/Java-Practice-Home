package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example6 {
	
	private static Integer integer;

	public static <E> void main(String[] args) {
		
     ArrayList<Integer> arrayList = new ArrayList<Integer>();
     Optional<Integer> reduce = arrayList.stream().reduce((a,b)->a+b);
	 System.out.println(reduce);
		
	 Integer integer2 = reduce.get();
	 System.out.println(integer2);
		
}
}
