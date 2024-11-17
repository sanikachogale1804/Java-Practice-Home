package ExceptionHandling;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount account=new BankAccount("Mitali Gurav", 10000.00);
		account.displayAccountInfo();
		
		while(true)
		{
			System.out.println("/nSelect an option");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("#.Exit");
			int option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter deposit amount:");
				double depositAmount=sc.nextDouble();
				account.deposit(depositAmount);
				break;
				
			case 2:
				System.out.println("Enter withdrawal amount:");
				double withdrawAmount = sc.nextDouble();
				try {
					account.withdraw(withdrawAmount);
				} catch (InsufficientFundsException e) {
					
					e.printStackTrace();
				}
				break;
				
			case 3:
				System.out.println("exiting...");
				System.exit(0);
				
				default:
					System.out.println("Invalid Option.Please try again");
			}
		}
	}
	
}
