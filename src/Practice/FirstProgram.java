package Practice;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		if(isPalindrome(number))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}
	public static boolean isPalindrome(number)
	{
		int originalNumber=number;
		int reversedNumber=0;
	}

}
