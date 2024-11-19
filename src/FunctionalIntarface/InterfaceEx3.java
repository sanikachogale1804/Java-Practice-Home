package FunctionalIntarface;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StringFilter
{
	boolean test(String str);
}

public class InterfaceEx3 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple","banana","water-melon","kivi");
		
	}
	
}
