package FunctionalIntarface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class InterfaceEx6 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isEven=(num)-> num % 2 == 0;
		System.out.println(isEven.test(30));
		System.out.println(isEven.test(89));
		
	}

}
