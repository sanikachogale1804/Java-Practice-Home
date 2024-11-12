package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
	   List<Integer> list=Arrays.asList(12,45,23,905,345,82);
	   
	   System.out.println(list);
	   for(Integer i:list)
	   {
		   if(i%5==0)
		   {
			   System.out.println(i);
		   }
	   }
		
	}

}
