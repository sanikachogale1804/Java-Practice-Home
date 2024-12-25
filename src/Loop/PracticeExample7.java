package Loop;

import java.util.Scanner;

public class PracticeExample7 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(isPrime(n))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		}

	private static boolean isPrime(int n) {
		if(n<=1)
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if()
			{
				
			}
		}
		
		return false;
	}
}
