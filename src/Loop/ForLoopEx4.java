package Loop;

import java.util.Scanner;

public class ForLoopEx4 {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		    System.out.println("prime numbers");
		else
			System.out.println("not prime number");
			
	}

}
