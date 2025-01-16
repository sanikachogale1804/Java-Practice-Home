package Practice;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("1:monday 2:Tuesday 3:wednesday 4:thursday 5:friday 6:saturday 7:sunday");

		switch(n)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
		} 
		
	}
	
}
