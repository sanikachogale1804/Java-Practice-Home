package Loop;

import java.util.Scanner;

public class ArraEx2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[5];
		
		for(int i=1;i<5;i++)
		{
			numbers[i]= sc.nextInt();
		}
	
		for(int i=1;i<5;i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
