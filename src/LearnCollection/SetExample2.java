package LearnCollection;

import java.util.HashSet;
import java.util.Scanner;

public class SetExample2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HashSet<String> colors=new HashSet<String>();
		
		
		for(int i=1;i<=5;i++)
		{
			String color=sc.next();
			colors.add(color);
		}
		System.out.println(colors);
	}

}
