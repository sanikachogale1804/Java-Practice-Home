package FunctionalIntarface;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface NumberFilter
{
	boolean test(int number);
}

public class InterfaceEx2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(56,89,24,90,45,37);
		
		NumberFilter isEven=(number)->number%2==0;
		
		for(int number:list)
		{
			if(isEven.test(number))
			{
				System.out.println(number);
			}
		}
	}

}
