package LearnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListExample3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			int n=sc.nextInt();
			list.add(n);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
