package FunctionalIntarface;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StringPredicate
{
	boolean test(String str);
}

public class InterfaceEx4 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("john","joel","Sanika","janki","mitali","riya");
		
	}

}
