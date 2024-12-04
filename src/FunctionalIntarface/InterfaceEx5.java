package FunctionalIntarface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceEx5 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple", "banana", "cherry");
		Comparator<String> comparator=(str1,str2)->str1.length()-str2.length();
		Collections.sort(list,comparator);
		
	}
	
}
