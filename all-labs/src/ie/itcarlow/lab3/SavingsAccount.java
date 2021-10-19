package ie.itcarlow.lab3;

public class SavingsAccount 
{
	private int accountNumber;
	private static double anualInterestRate;
	private double savingsBalance;
	private static int nextAccountNumber = 1;
	
	//CONSTRUCTOR
	public SavingsAccount()
	{
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	
	//SETTERS
	public void setSavingsBalance(double savingsBalance) 
	{
		this.savingsBalance = savingsBalance;
	}

	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public static void modifyInterestRate(double anualInterestRate) 
	{
		SavingsAccount.anualInterestRate = anualInterestRate;
	}

	public static void setNextAccountNumber(int nextAccountNumber) 
	{
		SavingsAccount.nextAccountNumber = nextAccountNumber;
	}
	
	//GETTERS
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getSavingsBalance() 
	{
		return savingsBalance;
	}

	public static double getAnualInterestRate() 
	{
		return anualInterestRate;
	}
	
	public static int getNextAccountNumber() 
	{
		return nextAccountNumber;
	}
	
	//METHODS
	public void calculateMonthlyInterest()
	{
		double interest = savingsBalance * anualInterestRate / 12;
		savingsBalance += interest;
	}

	public String toString() 
	{
		return "\n Account Number = " + accountNumber + " \n Savings Balance = " + String.format("%,.2f", getSavingsBalance());
	}

}
