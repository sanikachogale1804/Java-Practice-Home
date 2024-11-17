package ExceptionHandling;

public class BankAccount {
	
	private String AccountHolderName;
	private double balance;
	
	public BankAccount(String AccountHolderName,double balance)
	{
		this.AccountHolderName=AccountHolderName;
		this.balance=balance;		
	}

	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance=balance-amount;
			System.out.println("Deposited: "+amount);
			System.out.println("Current Balance: "+balance);
		}
		else
		{
			System.out.println("deposit amount must be greater than zero");
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("withdraw: "+amount);
			System.out.println("current balance: "+balance);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void displayAccountInfo()
	{
		System.out.println("Account Holder name: "+AccountHolderName);
		System.out.println("Current Balance: "+balance);
	}
}
