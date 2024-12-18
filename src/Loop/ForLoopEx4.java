package Loop;

import java.util.Scanner;

public class ForLoopEx4 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(i%2==0)
			{
				count++;
				
			}
		}
		
	}

}
