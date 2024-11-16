package ClassesAndObjects;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean subscribed=false;
		char decision=sc.next().charAt(0);
		
		if(decision == 'y' || decision == 'Y')
		{
			subscribed = true;
		}
		System.out.println("Subscribed");
		
		if(subscribed==true)
		{
			System.out.println("you are subscribed");
		}
		else
		{
			System.out.println("you are not subscribed");
		}
	}
	
}
