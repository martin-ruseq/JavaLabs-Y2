package ie.itcarlow.lab3;

public class BankCustomer 
{
	private String customerName;
	private String customerAddress;
	private double	savingsAccount1;
	private double	savingsAccount2;
	private double	savingsAccount3;
	
	private static int validSavingsAccounts = 0;
	
	
//CONSTRUCTOR
	
	public BankCustomer(String name, String address)
	{
		setCustomerName(name);
		setCustomerAddress(address);
	}
	
//SETTERS
	
	public void setCustomerName(String name)
	{
		customerName = name;
	}
	
	public void setCustomerAddress(String address)
	{
		customerAddress = address;
	}
	
	public void addAccount1(double balance) 
	{
		this.savingsAccount1 = balance;
		validSavingsAccounts++;
	}

	public void addAccount2(double balance) 
	{
		this.savingsAccount2 = balance;
		validSavingsAccounts++;

	}
	
	public void addAccount3(double balance) 
	{
		this.savingsAccount3 = balance;
		validSavingsAccounts++;

	}

	
//GETTERS
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	
	public double getBalanceAccount1() 
	{
		return savingsAccount1;
	}

	public double getBalanceAccount2() 
	{
		return savingsAccount2;
	}
	
	public double getBalanceAccount3() 
	{
		return savingsAccount3;
	}
	public static int getValidSavingsAccounts()
	{
		return validSavingsAccounts;
	}
	
	
//METHODS
	public double balance()
	{
		double totalBalance = getBalanceAccount1() + getBalanceAccount2() + getBalanceAccount3();
		
		return totalBalance;
	}
	
	public String printSummary()
	{
		String summary;
		
		summary = "";
		summary += "\n Customer Name: " + getCustomerName();
		summary += "\n Customer Address: " + getCustomerAddress() + "\n";
		summary += "\n Account 1 Savings Balance: " + getBalanceAccount1() + "\n Account 2 Savings Balance: " + getBalanceAccount2() + "\n Account 3 Savings Balance: " + getBalanceAccount3() + "\n";
		summary += "\n Total Savings: " + balance();
		
		return  summary;
	}

}
