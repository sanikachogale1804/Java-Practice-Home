package Loop;

import java.util.Scanner;

public class PracticeExample8 {
	
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

}
