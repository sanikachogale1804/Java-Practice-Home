package Loop;

import java.util.Scanner;

public class PracticeExample7 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		if(isPrime(n))
		{
			System.out.println("Prime");
		}
		else 
		{
			System.out.println("not prime");
		}
		
		
		public static boolean isPrime(int num)
		{
			if(num<=1)
			{
				return false;
			}
			
		}
		
	}
	
	

}
